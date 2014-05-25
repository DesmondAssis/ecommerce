package com.desmond.generator.run;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jdom2.Comment;
import org.jdom2.Content;
import org.jdom2.Content.CType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.util.IteratorIterable;

import com.desmond.ecommerce.util.cgenerate.TemplateEnum;
import com.desmond.ecommerce.util.log.DMLogger;
import com.desmond.generator.DesmondXMLConstant;
import com.desmond.generator.run.model.Column;
 
public class TestRun {
 
    private static String packageName = null;
    private static String author = null;
    private static String namespace = null;
    
    private static Map<Integer, String> templateFileMap = new HashMap<Integer, String>();
    
    private static DMLogger log = new DMLogger(TestRun.class.getName());
 
    public static void main(String[] args) throws JDOMException, IOException {
    	init();
    	InputStream in = TestRun.class.getClassLoader().getResourceAsStream("com/desmond/generator/service-user.xml");
        // Use a SAX builder
        SAXBuilder builder = new SAXBuilder();
        // build a JDOM2 Document using the SAXBuilder.
        Document jdomDoc = builder.build(in);
 
        // get the document type
        log.info(jdomDoc.getDocType());
 
        //get the root element
        Element root = jdomDoc.getRootElement();
        if(root != null) {
        	 packageName = root.getAttributeValue(DesmondXMLConstant.PACKAGE_NAME);
        	 Element author = null, namespace = null;
        	 String authorValue = (author = root.getChild(DesmondXMLConstant.AUTHOR)) != null ? author.getTextTrim() : "Presley";
        	 String nspValue = (namespace = root.getChild(DesmondXMLConstant.NAMESPACE)) != null ? namespace.getTextTrim() : "ec";
        	 List<Element> entityList = root.getChildren(DesmondXMLConstant.ENTITY);
        	 log.info(entityList.size());
        	 for(Element entity : entityList) {
        		 log.info("s0" + entity);
        		 generateModelAndSQL(entity);
        	 }
        	 
        }
    }
    
    private static void generateModelAndSQL(Element entity) {
    	List<Element> columnElementList = entity.getChildren(DesmondXMLConstant.COLUMN);
    	List<Column> columnList = new ArrayList<Column>(columnElementList.size());
    	if(columnElementList != null &&!columnElementList.isEmpty()) {
    		for(Element ele : columnElementList) {
    			if(ele == null) break;
    			Column column = new Column(
    						StringUtils.trim(ele.getAttributeValue(DesmondXMLConstant.NAME)),
    						StringUtils.trim(ele.getAttributeValue(DesmondXMLConstant.TYPE)),
    						BooleanUtils.toBoolean(ele.getAttributeValue(DesmondXMLConstant.PRIMARY)),
    						BooleanUtils.toBoolean(ele.getAttributeValue(DesmondXMLConstant.AUTO_INCREMENT)),
    						BooleanUtils.toBoolean(ele.getAttributeValue(DesmondXMLConstant.UNIQUE)),
    						BooleanUtils.toBoolean(ele.getAttributeValue(DesmondXMLConstant.NOT_NULL))
    						);
    			columnList.add(column);
    		}
    		String modelName = generateModel(columnList, entity.getAttributeValue(DesmondXMLConstant.NAME));
    		generateModelImpl(columnList, entity.getAttributeValue(DesmondXMLConstant.NAME), modelName);
    		
    	}
    }
    
    private String generateSQL(List<Column> columnList, String entityName) {
    	StringBuilder sqlSb = new StringBuilder("create table");
    	
    	for(Column c : columnList) {
    		String nameUnCapitalition = StringUtils.uncapitalize(c.getName());
    	}
    	
    	
    	return sql;
    }
    
    private static String generateModel(List<Column> columnList, String entityName) {
    	String template = templateFileMap.get(TemplateEnum.MODEL.getType());
    	StringBuilder setterAndGetterSb = new StringBuilder();
    	StringBuilder importsSb = new StringBuilder();
    	Map<String, String> flagMap = new HashMap<String, String>();
    	
    	for(Column c : columnList) {
    		String nameCapitalition = StringUtils.capitalize(c.getName());
    		String nameUnCapitalition = StringUtils.uncapitalize(c.getName());
    		if(c.getType().equals("Date") && !flagMap.containsKey("Date")) {
    			importsSb.append("import java.util.Date;\n");
    			flagMap.put("Date", "");
    		} else if(c.getType().equals("Time") && !flagMap.containsKey("Time")) {
    			importsSb.append("import java.sql.Time;\n");
    			flagMap.put("Time", "");
    		}
    		// getter
    		setterAndGetterSb.append("\r\tpublic ")
    				.append(c.getType())
    				.append(" get")
    				.append(nameCapitalition)
    				.append("(")
    				.append(");")
    				.append("\r\n");
    		
    		// setter
    		setterAndGetterSb.append("\r\tpublic ")
    				.append("void")
    				.append(" set")
    				.append(nameCapitalition)
    				.append("(")
    				.append(c.getType())
    				.append(" ")
    				.append(nameUnCapitalition)
    				.append(");")
    				.append("\r\n");
    	}
    	
    	template = template.replace("${packageName}", packageName+".intf")
    			.replace("${imports}", importsSb.toString())
    			.replace("${model}", StringUtils.capitalize(entityName))
    			.replace("${setterAndGetter}", setterAndGetterSb.toString());
    	
    	String packageFileName = packageName.replace(".", "/");
    	StringBuilder fileNameSb = new StringBuilder("L:/gitHub/projects/eCommerce/src/");
    	fileNameSb.append(packageFileName).append("/").append("intf/").append(entityName).append(".java");
    	
    	// write to source
    	writeToDestFile(template, fileNameSb.toString());
    	
    	return packageName + ".intf." + entityName; 
    }
    
    private static void generateModelImpl(List<Column> columnList, String entityName, String modelName) {
    	String template = templateFileMap.get(TemplateEnum.MODEL_IMPL.getType());
    	StringBuilder privateFieldsSb = new StringBuilder();
    	StringBuilder setterAndGetterSb = new StringBuilder();
    	StringBuilder importsSb = new StringBuilder();
    	Map<String, String> flagMap = new HashMap<String, String>();
    	
    	for(Column c : columnList) {
    		String nameCapitalition = StringUtils.capitalize(c.getName());
    		String nameUnCapitalition = StringUtils.uncapitalize(c.getName());
    		if(c.getType().equals("Date") && !flagMap.containsKey("Date")) {
    			importsSb.append("import java.util.Date;\n");
    			flagMap.put("Date", "");
    		} else if(c.getType().equals("Time") && !flagMap.containsKey("Time")) {
    			importsSb.append("import java.sql.Time;\n");
    			flagMap.put("Time", "");
    		}
    		
    		// private fields
    		privateFieldsSb.append("\r\tprivate ")
    				.append(c.getType())
    				.append(" ")
    				.append(c.getName())
    				.append(";")
    				.append("\r\n");
    		
    		// getter
    		setterAndGetterSb.append("\r\tpublic ")
    				.append(c.getType())
    				.append(" get")
    				.append(nameCapitalition)
    				.append("(")
    				.append(") {")
    				.append("\r\t\treturn ")
    				.append(c.getName())
    				.append(";")
    				.append("\r\t}")
    				.append("\r\n");
    		
    		// setter
    		setterAndGetterSb.append("\r\tpublic ")
    				.append("void")
    				.append(" set")
    				.append(nameCapitalition)
    				.append("(")
    				.append(c.getType())
    				.append(" ")
    				.append(nameUnCapitalition)
    				.append(") {")
    				.append("\r\t\tthis.")
    				.append(nameUnCapitalition)
    				.append(" = ")
    				.append(nameUnCapitalition)
    				.append(";")
    				.append("\r\t}")
    				.append("\r\n");
    				
    	}
    	importsSb.append("import " + modelName + ";\n");
    	template = template.replace("${packageName}", packageName+".impl")
    			.replace("${imports}", importsSb.toString())
    			.replace("${modelImpl}", StringUtils.capitalize(entityName) + "Impl")
    			.replace("${model}", StringUtils.capitalize(entityName))
    			.replace("${privateFields}", privateFieldsSb.toString())
    			.replace("${setterAndGetter}", setterAndGetterSb.toString());
    	
    	String packageFileName = packageName.replace(".", "/");
    	StringBuilder fileNameSb = new StringBuilder("L:/gitHub/projects/eCommerce/src/");
    	fileNameSb.append(packageFileName).append("/").append("impl/").append(entityName).append("Impl").append(".java");
    	
    	// write to source file.
    	writeToDestFile(template, fileNameSb.toString());
    }
    
    private static void writeToDestFile(String sourceFileStr, String destdile) {
    	try {
    		int index = destdile.lastIndexOf("/");
    		String dirctoryStr = index != -1 ? destdile.substring(0, index) : "";
    		File directory = new File(dirctoryStr);
    		if(!directory.exists()) {
    			directory.mkdir();
    		} else if(!directory.isDirectory()) {
    			directory.delete();
    			directory.mkdir();
    		}
    		
    		BufferedWriter bw = new BufferedWriter(new FileWriter(destdile));
    		log.info(sourceFileStr);
			bw.write(sourceFileStr);
			bw.flush();
		} catch (FileNotFoundException e) {
			log.error(e, "stst", 3, e);
		} catch (IOException e) {
			log.error(e, "stst", 3, e);
		}
    }
    
    private static String getServiceFileAsString(String fileName) {
    	log.info("fileName: " + fileName);
    	String templateFileAsString = null;
    	InputStream in = TestRun.class.getClassLoader().getResourceAsStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(in);
		try {
			int size = in.available();
			byte[] b = new byte[size];
			bis.read(b, 0, size);
			templateFileAsString = new String(b);
		} catch (IOException e) {
			log.error(e, "Cannot get data from source file: s%", fileName);
		}
    	
    	return templateFileAsString;
    }
    
    private static void init() {
    	for(TemplateEnum en : TemplateEnum.values()) {
    		String source = getServiceFileAsString(en.getRelativeURL());
    		templateFileMap.put(en.getType(), source);
    	}
    }
}

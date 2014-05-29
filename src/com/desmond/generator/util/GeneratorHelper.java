package com.desmond.generator.util;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.desmond.generator.DesmondXMLConstant;
import com.desmond.generator.run.TestRun;
import com.desmond.generator.run.model.Builder;
import com.desmond.generator.run.model.Column;
import com.desmond.generator.run.model.Entity;
import com.desmond.generator.util.enums.TemplateEnum;

public class GeneratorHelper {
	private static Logger log = Logger.getLogger(GeneratorHelper.class.getName());
	
	public static Map<Integer, String> templateFileMap = new HashMap<Integer, String>();
	
	static {
		for(TemplateEnum en : TemplateEnum.values()) {
    		String source = GeneratorHelper.getServiceFileAsString(en.getRelativeURL());
    		templateFileMap.put(en.getType(), source);
    	}
	}
	
	public static void writeToDestFile(String sourceFileStr, String destdile) {
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
			log.error("error", e);
		} catch (IOException e) {
			log.error("error", e);
		}
    }
    
    public static String getServiceFileAsString(String fileName) {
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
			log.error("Cannot get data from source file: " + fileName, e);
		}
    	
    	return templateFileAsString;
    }
    
    public static Builder transformElementToBean(Element root) {
		Builder builder = null;
		if (root != null) {
			builder = new Builder();
			Element author = null, namespace = null;

			String packageName = root
					.getAttributeValue(DesmondXMLConstant.PACKAGE_NAME);
			String authorValue = (author = root
					.getChild(DesmondXMLConstant.AUTHOR)) != null ? author
					.getTextTrim() : "Presley";
			String nspValue = (namespace = root
					.getChild(DesmondXMLConstant.NAMESPACE)) != null ? namespace
					.getTextTrim() : "ec";

			builder.setPackateName(packageName);
			builder.setAuthor(authorValue);
			builder.setNameSpace(nspValue);

			List<Element> elementEntityList = root
					.getChildren(DesmondXMLConstant.ENTITY);
			List<Entity> entities = new ArrayList<Entity>(
					elementEntityList.size());
			builder.setEntities(entities);
			for (Element eleEntity : elementEntityList) {
				Entity entity = new Entity();
				entity.setName(eleEntity
						.getAttributeValue(DesmondXMLConstant.NAME));
				entity.setTableName(eleEntity
						.getAttributeValue(DesmondXMLConstant.TABLE_NAME));
				List<Element> columnElementList = eleEntity
						.getChildren(DesmondXMLConstant.COLUMN);
				List<Column> columnList = new ArrayList<Column>(
						columnElementList.size());
				entity.setColumns(columnList);
				if (columnElementList != null && !columnElementList.isEmpty()) {
					for (Element ele : columnElementList) {
						if (ele == null)
							break;
						Column column = new Column(
								StringUtils
										.trim(ele
												.getAttributeValue(DesmondXMLConstant.NAME)),
								StringUtils.trim(ele
										.getAttributeValue(DesmondXMLConstant.TYPE)),
								BooleanUtils.toBoolean(ele
										.getAttributeValue(DesmondXMLConstant.PRIMARY)),
								BooleanUtils.toBoolean(ele
										.getAttributeValue(DesmondXMLConstant.AUTO_INCREMENT)),
								BooleanUtils.toBoolean(ele
										.getAttributeValue(DesmondXMLConstant.UNIQUE)),
								BooleanUtils.toBoolean(ele
										.getAttributeValue(DesmondXMLConstant.NOT_NULL)));
						columnList.add(column);
					}
				}

				entities.add(entity);
			}

		}

		return builder;
	}
    
    public static Element getService() throws JDOMException, IOException {
    	InputStream in = GeneratorHelper.class.getClassLoader().getResourceAsStream(
				"com/desmond/generator/service-user.xml");
		// Use a SAX builder
		SAXBuilder saxBuilder = new SAXBuilder();
		// build a JDOM2 Document using the SAXBuilder.
		Document jdomDoc = saxBuilder.build(in);

		// get the document type
		log.info(jdomDoc.getDocType());

		// get the root element
		Element root = jdomDoc.getRootElement();
		
		return root;
    }

}

package com.desmond.generator.run;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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

import com.desmond.generator.DesmondXMLConstant;
 
public class TestRun {
 
    private static String packageName = null;
    private static String author = null;
    private static String namespace = null;
    
    private static Logger log = Logger.getLogger(TestRun.class.getName());
 
    public static void main(String[] args) throws JDOMException, IOException {
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
        		 generateModel(entity);
        	 }
        }
        
    }
    
    private static void generateModel(Element entity) {
    	List<Element> columnList = entity.getChildren(DesmondXMLConstant.COLUMN);
    	
    }
}

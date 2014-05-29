package com.desmond.generator.run;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jdom2.Element;
import org.jdom2.JDOMException;

import com.desmond.generator.exception.NoSuchDBTypeException;
import com.desmond.generator.run.model.Builder;
import com.desmond.generator.util.GeneratorHelper;
import com.desmond.generator.util.ModelImplGeneratorHelper;
import com.desmond.generator.util.SQLGeneratorHelper;

public class TestRun {

	private static Logger log = Logger.getLogger(TestRun.class.getName());

	public static void main(String[] args) throws JDOMException, IOException {
		// get configuration files
		Element root = GeneratorHelper.getService();
		
		// transform
		Builder builder = GeneratorHelper.transformElementToBean(root);
		log.info(builder);
		
		// generate model
		ModelImplGeneratorHelper.generateModelAndImpl(builder);
		
		// generate dao
		
		// generate service
		
		// generate initial SQL
		try {
			SQLGeneratorHelper.creteTable(builder);
		} catch (NoSuchDBTypeException e) {
			log.error("error occus", e);
		}
		
	}

}

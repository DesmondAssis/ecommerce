package com.desmond.generator.util;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.desmond.generator.run.model.Builder;
import com.desmond.generator.run.model.Entity;
import com.desmond.generator.util.enums.TemplateEnum;

public class ServiceImplGeneratorHelper {
	private static Logger log = Logger.getLogger(ServiceImplGeneratorHelper.class.getName());
	
	private static void generateServiceBaseImpl(Builder builder) {
		String template = GeneratorHelper.templateFileMap
				.get(TemplateEnum.SERVICE_BASE_IMPL.getType());
		
		List<Entity> entityList = builder.getEntities();
		if (entityList != null && entityList.size() > 0) {
			for (Entity entity : entityList) {
				StringBuilder importsSb = new StringBuilder();
				
				importsSb.append("import " + builder.getPackateName()+ ".intf." + entity.getName());
				
				template = template
						.replace("${packageName}",
								builder.getPackateName() + ".impl")
						.replace("${imports}", importsSb.toString())
						.replace("${model}", entity.getName())
						.replace("${modelVariable}", StringUtils.uncapitalize(entity.getName()))
								;

				String packageFileName = builder.getPackateName().replace(".",
						"/");
				StringBuilder fileNameSb = new StringBuilder(
						"L:/gitHub/projects/eCommerce/src/");
				fileNameSb.append(packageFileName).append("/").append("impl/")
						.append(entity.getName()).append("ServiceBaseImpl.java");
				
				//log.info(template);
				// write to source
				GeneratorHelper
						.writeToDestFile(template, fileNameSb.toString());
			}
		}
	}
	
	private static void generateLocalServiceImpl(Builder builder) {
		String template = GeneratorHelper.templateFileMap
				.get(TemplateEnum.SERVICE_IMPL.getType());
		
		List<Entity> entityList = builder.getEntities();
		if (entityList != null && entityList.size() > 0) {
			for (Entity entity : entityList) {
				StringBuilder importsSb = new StringBuilder();
				template = template
						.replace("${packageName}",
								builder.getPackateName() + ".impl")
						.replace("${imports}", importsSb.toString())
						.replace("${model}", entity.getName())
							;

				String packageFileName = builder.getPackateName().replace(".",
						"/");
				StringBuilder fileNameSb = new StringBuilder(
						"L:/gitHub/projects/eCommerce/src/");
				fileNameSb.append(packageFileName).append("/").append("impl/")
						.append(entity.getName()).append("LocalServiceImpl.java");
				
				//log.info(template);
				// write to source
				GeneratorHelper
						.writeToDestFile(template, fileNameSb.toString());
			}
		}
	}
	
	public static void generateService(Builder builder) {
		// ServiceBaseImpl
		generateServiceBaseImpl(builder);
		
		// LocalServiceImpl
		generateLocalServiceImpl(builder);
		
	}
}
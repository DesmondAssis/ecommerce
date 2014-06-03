package com.desmond.generator.run;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jdom2.Element;
import org.jdom2.JDOMException;

import com.desmond.User.impl.UserDaoImpl;
import com.desmond.User.impl.UserImpl;
import com.desmond.User.intf.User;
import com.desmond.generator.exception.NoSuchDBTypeException;
import com.desmond.generator.run.model.Builder;
import com.desmond.generator.util.DaoImplGeneratorHelper;
import com.desmond.generator.util.GeneratorHelper;
import com.desmond.generator.util.ModelImplGeneratorHelper;
import com.desmond.generator.util.SQLGeneratorHelper;

public class TestRun {

	private static Logger log = Logger.getLogger(TestRun.class.getName());

	public static void main(String[] args) throws JDOMException, IOException {
		// get configuration files.
		Element root = GeneratorHelper.getService();
		
		// transform.
		Builder builder = GeneratorHelper.transformElementToBean(root);
		log.info(builder);
		
		// generate model.
		ModelImplGeneratorHelper.generateModelAndImpl(builder);
		
		// generate dao.
		DaoImplGeneratorHelper.generateDaoImpl(builder);
		// generate service
		
		// generate initial SQL.
		try {
			SQLGeneratorHelper.creteTable(builder);
		} catch (NoSuchDBTypeException e) {
			log.error("error occus", e);
		}
		
		
		// test CURD of user.
		testCURD();
	}
	
	private static void testCURD() {
		User user = new UserImpl();
		user.setName("Desmond1");
		user.setPassword("test");
		user.setReallyName("Desmond Li");
		user.setIdentity("4302344234234");
		user.setPostcode("908273");
		user.setEmail("test1@desmond.com");
		user.setAddress("Yu Shanghai G Rd.");
		user.setPhone("15009090909");
		user.setQuestion("My girl friend's name?");
		user.setAnswer("Alina Lin");
		
		UserDaoImpl userDao = new UserDaoImpl();
//		userDao.add(user);
		
		// update.
		user.setPrimaryKey(12);
		userDao.update(user);
		
		// read.
		User testUser = userDao.fetchByPrimaryKey(9);
		log.info(testUser.getEmail());
		
		// delete.
		userDao.delete(12);
	}

}

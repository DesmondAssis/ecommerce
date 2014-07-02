package com.desmond.nec.user;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.desmond.nec.user.dao.UserDao;
import com.desmond.nec.user.model.User;

public class TestUser {
	ApplicationContext ac;
	UserDao userDao;
	User user;
	
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userDao = (UserDao) ac.getBean("userDao");
		user = new User().mockUserImpl();
	}
	
	@Test
	public void test() {
		long i = userDao.add(user);
		Assert.assertTrue("msg", i > 0);
	}
}

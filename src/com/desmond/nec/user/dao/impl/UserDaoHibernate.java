package com.desmond.nec.user.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.desmond.nec.user.dao.UserDao;
import com.desmond.nec.user.model.User;

/**
 * Implement the UserDao.
 * 
 * @See UserDao
 * @author Presley.Li
 * @time 2012-3-28 下午04:56:45
 */
@SuppressWarnings("unchecked")
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao{
	public long add(User user) {
		return (Long)getHibernateTemplate().save(user);
	}

	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	public java.util.List<User> findByNamePwd(String name, String password) {
		String sql = "from User u where u.name = ? and u.password = ?";
		return (java.util.List<User>)getHibernateTemplate().find(sql, name, password);
	}

	public void delete(long primaryKey) {
		User user = new User();
		user.setId(primaryKey);
		getHibernateTemplate().delete(user);
	}
	
	public List<User> loadAll() {
		return getHibernateTemplate().loadAll(User.class);
	}

	private static Logger log = Logger.getLogger(UserDaoHibernate.class
			.getName());
}

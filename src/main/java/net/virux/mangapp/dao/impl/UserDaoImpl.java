package net.virux.mangapp.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.mangapp.dao.UserDao;
import net.virux.mangapp.model.User;

//@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

	@Override
	public User get(String username) {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria cr = session.createCriteria(User.class)
				.add(Restrictions.eq("username", username));
		User usr = (User) cr.uniqueResult();
		tx.commit();
		session.close();
		return usr;
	}
}

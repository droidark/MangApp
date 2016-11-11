package net.virux.mangapp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.mangapp.dao.UserDao;
import net.virux.mangapp.model.User;

@Repository("userDao") 
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User usr = this.getUser(user.getUsername());
		if(usr == null){
			session.save(user);
		}
		tx.commit();
		session.close();
		
	}

	@Override
	public List<User> getAllUser() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(User.class);
		List<User> users = cr.list();
		tx.commit();
		session.close();
		return users;
	}

	@Override
	public User getUser(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user = session.get(User.class, id);
		tx.commit();
		session.close();
		return user;
	}

	@Override
	public User getUser(String username) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(User.class)
				.add(Restrictions.eq("username", username));
		User usr = (User) cr.uniqueResult();
		tx.commit();
		session.close();
		return usr;
	}

	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}

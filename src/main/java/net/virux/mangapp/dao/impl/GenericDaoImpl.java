package net.virux.mangapp.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import net.virux.mangapp.dao.GenericDao;

public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K> {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<? extends E> daoType;
	
	/**
	 * By defining this class as abstract, we prevent Spring from creating instance of this
	 * class if not defined abstract getClass().getGenericSuperClass() would return Object.
	 * There wouldbe exception because Object class does not have constructor with parame-
	 * ters  
	 */
	
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		daoType = (Class) pt.getActualTypeArguments()[0];
	}
	
	
	@Override
	public void add(E entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		
	}

	@Override
	public void saveOrUpdate(E entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(entity);
		tx.commit();
		session.close();
		
	}

	@Override
	public void update(E entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(entity);
		tx.commit();
		session.close();		
	}

	@Override
	public void remove(E entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(entity);
		tx.commit();
		session.close();
		
	}

	@Override
	public E find(K key) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		E mdl = session.get(daoType, key);
		return mdl;
	}

	@Override
	public List<E> getAll() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(daoType);
		List<E> list = cr.list();
		tx.commit();
		session.close();
		return list;
	}
	
	

}

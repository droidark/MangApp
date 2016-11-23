package net.virux.mangapp.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.mangapp.dao.GenericDao;

//@Repository("genericDao")
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K>{

	//@Autowired
	SessionFactory sessionFactory;
	
	private Class<E> clazz;
	
	protected Session session;
	protected Transaction tx;
	
	@Override
	public void add(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> getAll() {
//		this.session = sessionFactory.openSession();
//		this.tx = this.session.beginTransaction();
//		CriteriaBuilder builder = this.session.getCriteriaBuilder();
//		CriteriaQuery<E> criteria = builder.createQuery(clazz);
//		Root<E> genericRoot = criteria.from(clazz);
//		criteria.select(genericRoot);
//		List<E> list = this.session.createQuery(criteria).getResultList();
//		this.tx.commit();
//		this.session.close();
//		return list;
		return null;
	}

}

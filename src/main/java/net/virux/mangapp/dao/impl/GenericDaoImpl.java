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

public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K>{

	@Autowired
	SessionFactory sessionFactory;
	
	private Class<E> clazz;
	
	private Session session;
	private Transaction tx;
	
	
//	public GenericDaoImpl() {
//        Type t = getClass().getGenericSuperclass();
//        ParameterizedType pt = (ParameterizedType) t;
//        daoType = (Class) pt.getActualTypeArguments()[0];
//        System.out.println(daoType);
//    }
	
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

	@SuppressWarnings("deprecation")
	@Override
	public List<E> getAll() {
		this.session = sessionFactory.openSession();
		this.tx = this.session.beginTransaction();
		Criteria cr = session.createCriteria(clazz.getClass());
		List<E> request = cr.list();
		this.tx.commit();
		this.session.close();
		return request;
	}

}

package net.virux.mangapp.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.virux.mangapp.dao.GenericDao;
import net.virux.mangapp.service.GenericService;

@Service("genericService")
public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K>{

	private GenericDao<E, K> genericDao;
	
	public GenericServiceImpl(GenericDao<E, K> genericDao) {
		this.genericDao = genericDao;
	}
	
	@Override
	public void add(E entity) {
		genericDao.add(entity);
	}

	@Override
	public void saveOrUpdate(E entity) {
		genericDao.saveOrUpdate(entity);		
	}

	@Override
	public void update(E entity) {
		genericDao.update(entity);		
	}

	@Override
	public void delete(E entity) {
		genericDao.delete(entity);
	}

	@Override
	public E get(K key) {
		return genericDao.get(key);
	}

	@Override
	public List<E> getAll() {
		return genericDao.getAll();
	}	

}

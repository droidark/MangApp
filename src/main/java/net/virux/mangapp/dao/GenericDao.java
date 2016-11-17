package net.virux.mangapp.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {
	
	void add(T entity);
	
	List<T> getAll();
	
	T get(ID id);
	
	void set(T entity);
	
	void delete(T entity);
}

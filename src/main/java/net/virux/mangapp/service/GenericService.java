package net.virux.mangapp.service;

import java.util.List;

public interface GenericService<E, K> {

	void add(E entity);
	
	void saveOrUpdate(E entity);
	
	void update(E entity);
	
	void delete(E entity);
	
	E get(K key);
	
	List<E> getAll();
}

package net.virux.mangapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.virux.mangapp.dao.GenericDao;
import net.virux.mangapp.model.Title;
import net.virux.mangapp.service.GenericService;

@Service("titleService")
public class TitleServiceImpl implements GenericService<Title, Integer>{
	
	@Autowired
	private GenericDao<Title, Integer> genericDao;

	@Override
	public void add(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Title entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Title get(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Title> getAll() {
		System.out.println("Llego aqui");
		return genericDao.getAll();
	}
	
	

}

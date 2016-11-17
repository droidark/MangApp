package net.virux.mangapp.dao;

import java.util.List;

import net.virux.mangapp.model.Title;

public interface TitleDao {	
	void addTitle(Title title);	
	List<Title> getAllTitle();	
	Title getTitle(int id);	
	Title getTitle(String titlename);	
	void setTitle(Title title);	
	void deleteTitle(Title title);
}
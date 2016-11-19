package net.virux.mangapp.service;

import java.util.List;

import net.virux.mangapp.model.Title;

public interface TitleService {
	void addTitle(Title title);	
	List<Title> getAllTitles();	
	Title getTitle(int id);	
	void setTitle(Title title);	
	void deleteTitle(Title title);
}

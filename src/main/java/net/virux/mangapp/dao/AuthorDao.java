package net.virux.mangapp.dao;

import java.util.List;

import net.virux.mangapp.model.Author;

public interface AuthorDao {	
	void addAuthor(Author author);	
	List<Author> getAllAuthor();	
	Author getAuthor(int id);	
	Author getAuthor(String authorname);	
	void setAuthor(Author author);	
	void deleteAuthor(Author author);
}
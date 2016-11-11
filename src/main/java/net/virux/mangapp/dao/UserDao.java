package net.virux.mangapp.dao;

import java.util.List;

import net.virux.mangapp.model.User;

public interface UserDao {	
	void addUser(User user);	
	List<User> getAllUser();	
	User getUser(int id);	
	User getUser(String username);	
	void setUser(User user);	
	void deleteUser(User user);
}
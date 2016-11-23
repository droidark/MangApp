package net.virux.mangapp.dao;

import net.virux.mangapp.model.User;

public interface UserDao extends GenericDao<User, Integer>{
	User get(String username);
}
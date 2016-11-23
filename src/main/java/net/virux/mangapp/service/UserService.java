package net.virux.mangapp.service;

import java.util.List;

import net.virux.mangapp.model.User;

public interface UserService {
	public User create(User shop);
	public User delete(Integer id);
	public List<User> findAll();
	public User update(User shop);
	public User get(Integer id);
	public User get(String username);
}
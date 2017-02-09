package net.virux.mangapp.service;

import java.util.List;

import net.virux.mangapp.model.User;

public interface UserService {
//	public User create(User user);
//	public User delete(Integer id);
//	public List<User> findAll();
//	public User update(User user);
//	public User get(Integer id);
//	public User get(String username);
	
	public User save(User user);
	public User delete(Integer id);
	public List<User> findAll();
	public User findByIdUser(Integer id);
	public User findByUsername(String username);
}
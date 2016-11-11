package net.virux.mangapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.virux.mangapp.dao.UserDao;
import net.virux.mangapp.model.User;
import net.virux.mangapp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDao.addUser(user);		
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Override
	public User getUser(String username) {
		return userDao.getUser(username);
	}

	@Override
	public void setUser(User user) {
		userDao.setUser(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);		
	}

}

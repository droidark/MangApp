package net.virux.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.mangapp.model.User;
import net.virux.mangapp.repository.UserRepository;
import net.virux.mangapp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;

	@Override
	public User create(User shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User update(User shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

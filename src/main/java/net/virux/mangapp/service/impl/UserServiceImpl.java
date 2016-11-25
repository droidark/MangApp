package net.virux.mangapp.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.virux.mangapp.model.Profile;
import net.virux.mangapp.model.User;
import net.virux.mangapp.repository.UserRepository;
import net.virux.mangapp.service.ProfileService;
import net.virux.mangapp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ProfileService profileService;

	@Override
	public User create(User user) {
		System.out.println(userRepository.get(user.getUsername()));
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setSignUpDate(new Date());
		user.setState("Pending");
		Set<Profile> profiles = new HashSet<Profile>();
		profiles.add(profileService.get(2));
		user.setProfiles(profiles);
		userRepository.save(user);
		
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
	public User update(User user) {
		return null;
	}

	@Override
	public User get(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public User get(String username) {
		return userRepository.get(username);
	}
	
}

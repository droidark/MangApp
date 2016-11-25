package net.virux.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.virux.mangapp.model.Profile;
import net.virux.mangapp.repository.ProfileRepository;
import net.virux.mangapp.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService{
	
	@Resource
	private ProfileRepository profileRepository;

	@Override
	public Profile create(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile update(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile get(Integer id) {
		return profileRepository.findOne(id);
	}

}

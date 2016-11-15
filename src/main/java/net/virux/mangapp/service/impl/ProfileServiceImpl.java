package net.virux.mangapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.virux.mangapp.dao.ProfileDao;
import net.virux.mangapp.model.Profile;
import net.virux.mangapp.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileDao profileDao;

	@Override
	public void addProfile(Profile profile) {
		profileDao.addProfile(profile);
		
	}

	@Override
	public List<Profile> getAllProfile() {
		return profileDao.getAllProfile();
	}

	@Override
	public Profile getProfile(int id) {
		return profileDao.getProfile(id);
	}

	@Override
	public Profile getProfile(String profile) {
		return profileDao.getProfile(profile);
	}

	@Override
	public void setProfile(Profile profile) {
		profileDao.setProfile(profile);
		
	}

	@Override
	public void deleteProfile(Profile profile) {
		profileDao.deleteProfile(profile);
		
	}

}

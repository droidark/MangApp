package net.virux.mangapp.service;

import java.util.List;

import net.virux.mangapp.model.Profile;

public interface ProfileService {
	Profile create(Profile profile);
	Profile delete(Integer id);
	List<Profile> findAll();
	Profile update(Profile profile);
	Profile get(Integer id);
}

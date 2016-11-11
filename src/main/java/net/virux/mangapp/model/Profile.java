package net.virux.mangapp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Profile implements Serializable{
	private Integer idProfile;
	private String profile;
	private Set<User> users = new HashSet<User>();
	
	public Integer getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}

package net.virux.mangapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_profile")
public class Profile{
	
	private Integer idProfile;
	private String profile;
	private Set<User> users = new HashSet<User>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profile")
	public Integer getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}
	
	@Column(name = "profile")
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	@ManyToMany(mappedBy = "profiles")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}

package net.virux.mangapp.model;

import java.util.HashSet;
import java.util.Set;

public class Author {
	private Integer idAuthor;
	private String name;
	private String nameJp;
	private String avatar;
	private String bio;
	private Set<Title> titles = new HashSet<Title>();
	
	public Integer getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(Integer idAuthor) {
		this.idAuthor = idAuthor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameJp() {
		return nameJp;
	}
	public void setNameJp(String nameJp) {
		this.nameJp = nameJp;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Set<Title> getTitles() {
		return titles;
	}
	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
}

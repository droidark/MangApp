package net.virux.mangapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_author")
public class Author {
	
	@Id
	@GeneratedValue
	@Column(name = "id_author")
	private Integer idAuthor;
	
	@Column(name = "author_name")
	private String name;
	
	@Column(name = "author_name_jp")
	private String nameJp;
	
	@Column(name = "author_avatar")
	private String avatar;
	
	@Column(name = "author_bio")
	private String bio;
	
	
//	private Set<Title> titles = new HashSet<Title>();
	
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
//	public void setBio(String bio) {
//		this.bio = bio;
//	}
//	public Set<Title> getTitles() {
//		return titles;
//	}
//	public void setTitles(Set<Title> titles) {
//		this.titles = titles;
//	}
}

package net.virux.mangapp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_title")
public class Title {
	
	private Integer idTitle;
	private Integer idEditorial;
	private String titleName;
	private String titleCover;
	private Integer totalVolumes;
	private Integer volumesPublishedJp;
	private Integer volumesPublishedMx;
	private String statusJp;
	private String statusMx;
	private Date jpLaunch;
	private Date mxLaunch;
	private Set<User> users = new HashSet<User>();
	
	@Id
	@GeneratedValue
	@Column(name = "id_title")
	public Integer getIdTitle() {
		return idTitle;
	}
	public void setIdTitle(Integer idTitle) {
		this.idTitle = idTitle;
	}
	
	@Column(name = "id_editorial")
	public Integer getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}
	
	@Column(name = "title_name")
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	@Column(name = "title_cover")
	public String getTitleCover() {
		return titleCover;
	}
	public void setTitleCover(String titleCover) {
		this.titleCover = titleCover;
	}
	
	@Column(name = "title_total_volumes")
	public Integer getTotalVolumes() {
		return totalVolumes;
	}
	public void setTotalVolumes(Integer totalVolumes) {
		this.totalVolumes = totalVolumes;
	}
	
	@Column(name = "title_volumes_published_jp")
	public Integer getVolumesPublishedJp() {
		return volumesPublishedJp;
	}
	public void setVolumesPublishedJp(Integer volumesPublishedJp) {
		this.volumesPublishedJp = volumesPublishedJp;
	}
	
	@Column(name = "title_volumes_published_mx")
	public Integer getVolumesPublishedMx() {
		return volumesPublishedMx;
	}
	public void setVolumesPublishedMx(Integer volumesPublishedMx) {
		this.volumesPublishedMx	= volumesPublishedMx;
	}
	
	@Column(name = "title_status_jp")
	public String getStatusJp() {
		return statusJp;
	}
	public void setStatusJp(String statusJp) {
		this.statusJp = statusJp;
	}
	
	@Column(name = "title_status_mx")
	public String getStatusMx() {
		return statusMx;
	}
	public void setStatusMx(String statusMx) {
		this.statusMx = statusMx;
	}
	
	@Column(name = "title_jp_launch")
	public Date getJpLaunch() {
		return jpLaunch;
	}
	public void setJpLaunch(Date jpLaunch) {
		this.jpLaunch = jpLaunch;
	}
	
	@Column(name = "title_mx_launch")
	public Date getMxLaunch() {
		return mxLaunch;
	}
	public void setMxLaunch(Date mxLaunch) {
		this.mxLaunch = mxLaunch;
	}
	
	@ManyToMany(mappedBy = "titles")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
//	public Set<Author> getAuthors() {
//		return authors;
//	}
//	public void setAuthors(Set<Author> authors) {
//		this.authors = authors;
//	}
}

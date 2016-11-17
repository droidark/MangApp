package net.virux.mangapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Title implements Serializable{
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
	private Set<Author> authors = new HashSet<Author>();
	
	public Integer getIdTitle() {
		return idTitle;
	}
	public void setIdTitle(Integer idTitle) {
		this.idTitle = idTitle;
	}
	public Integer getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTitleCover() {
		return titleCover;
	}
	public void setTitleCover(String titleCover) {
		this.titleCover = titleCover;
	}
	public Integer getTotalVolumes() {
		return totalVolumes;
	}
	public void setTotalVolumes(Integer totalVolumes) {
		this.totalVolumes = totalVolumes;
	}
	public Integer getVolumesPublishedJp() {
		return volumesPublishedJp;
	}
	public void setVolumesPublishedJp(Integer volumesPublishedJp) {
		this.volumesPublishedJp = volumesPublishedJp;
	}
	public Integer getVolumesPublishedMx() {
		return volumesPublishedMx;
	}
	public void setVolumesPublishedMx(Integer volumesPublishedMx) {
		this.volumesPublishedMx	= volumesPublishedMx;
	}
	public String getStatusJp() {
		return statusJp;
	}
	public void setStatusJp(String statusJp) {
		this.statusJp = statusJp;
	}
	public String getStatusMx() {
		return statusMx;
	}
	public void setStatusMx(String statusMx) {
		this.statusMx = statusMx;
	}
	public Date getJpLaunch() {
		return jpLaunch;
	}
	public void setJpLaunch(Date jpLaunch) {
		this.jpLaunch = jpLaunch;
	}
	public Date getMxLaunch() {
		return mxLaunch;
	}
	public void setMxLaunch(Date mxLaunch) {
		this.mxLaunch = mxLaunch;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
}

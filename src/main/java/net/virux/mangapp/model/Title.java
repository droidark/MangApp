package net.virux.mangapp.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_title")
public class Title {
	
	@Id
	@GeneratedValue
	@Column(name = "id_title")
	private Integer idTitle;
	
	@Column(name = "id_editorial")
	private Integer idEditorial;
	
	@Column(name = "title_name")
	private String titleName;
	
	@Column(name = "title_cover")
	private String titleCover;
	
	@Column(name = "title_total_volumes")
	private Integer totalVolumes;
	
	@Column(name = "title_volumes_published_jp")
	private Integer volumesPublishedJp;
	
	@Column(name = "title_volumes_published_mx")
	private Integer volumesPublishedMx;
	
	@Column(name = "title_status_jp")
	private String statusJp;
	
	@Column(name = "title_status_mx")
	private String statusMx;
	
	@Column(name = "title_jp_launch")
	private Date jpLaunch;
	
	@Column(name = "title_mx_launch")
	private Date mxLaunch;
	
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
//	public Set<User> getUsers() {
//		return users;
//	}
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
//	public Set<Author> getAuthors() {
//		return authors;
//	}
//	public void setAuthors(Set<Author> authors) {
//		this.authors = authors;
//	}
}

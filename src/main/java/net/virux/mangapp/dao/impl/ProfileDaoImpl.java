package net.virux.mangapp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.mangapp.dao.ProfileDao;
import net.virux.mangapp.model.Profile;
import net.virux.mangapp.model.User;

@Repository("profileDao")
public class ProfileDaoImpl implements ProfileDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addProfile(Profile profile) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Profile prof = this.getProfile(profile.getProfile());
		if(prof == null){
			session.save(prof);
		}
		tx.commit();
		session.close();
		
	}

	@Override
	public List<Profile> getAllProfile() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Profile.class);
		List<Profile> profiles = cr.list();
		tx.commit();
		session.close();
		return profiles;
	}

	@Override
	public Profile getProfile(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Profile profile = session.get(Profile.class, id);
		tx.commit();
		session.close();
		return profile;
	}

	@Override
	public Profile getProfile(String profile) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Profile.class)
				.add(Restrictions.eq("username", profile));
		Profile prof = (Profile) cr.uniqueResult();
		tx.commit();
		session.close();
		return prof;
	}

	@Override
	public void setProfile(Profile profile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile(Profile profile) {
		// TODO Auto-generated method stub
		
	}

}

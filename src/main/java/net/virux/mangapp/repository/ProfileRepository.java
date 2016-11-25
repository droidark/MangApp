package net.virux.mangapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.virux.mangapp.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}

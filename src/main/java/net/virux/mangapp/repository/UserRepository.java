package net.virux.mangapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.virux.mangapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

package net.virux.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import net.virux.mangapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
//	@Query("SELECT u FROM User u WHERE u.username = :username")
//	User get(@Param("username") String username);
	List<User> findAll();
	User findByIdUser(Integer id);
	User findByUsername(String username);
}

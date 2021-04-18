package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public User findByEmailAndPassword(String email, String password);
	
	
	
}

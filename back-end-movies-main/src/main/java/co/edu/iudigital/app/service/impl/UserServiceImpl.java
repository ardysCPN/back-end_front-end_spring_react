package co.edu.iudigital.app.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		boolean existsGender = userRepository
				.existsById(user.getUserId());
		
		boolean userExistEmail = findByEmail(user.getEmail());
		
		if(existsGender) {
			user.setCreateAt(LocalDateTime.now());
			userRepository.save(user);
		}else if(userExistEmail){
			user.setCreateAt(LocalDateTime.now());
			userRepository.save(user);
		}else {
			user.setCreateAt(LocalDateTime.now());
			userRepository.save(user);
		}
	}

	@Override
	public User login(User user) throws Exception {
		User existsUser = userRepository
				.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(existsUser == null) {
			throw new Exception("Usuario y/o contraseña invalido!");
		}
		return existsUser;
	}

	@Override
	public boolean findByEmail(String email) {
		List<User> users = new ArrayList<>();
		users = (List<User>) userRepository.findAll();
		
		boolean encontrado = users.stream().anyMatch(x -> x.getEmail().equalsIgnoreCase(email));
		return encontrado;
	}

}

package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.User;

public interface UserService {
	/**
	 * Crear nuevo usuario
	 * @param user
	 */
	public void create(User user);
	
	public boolean findByEmail(String email);
	/**
	 * Loguea un usuario
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
}

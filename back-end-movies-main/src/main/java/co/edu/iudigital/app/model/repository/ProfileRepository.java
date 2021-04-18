package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{
}

package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Gender;

public interface GenderRepository extends CrudRepository<Gender, Integer>{
}

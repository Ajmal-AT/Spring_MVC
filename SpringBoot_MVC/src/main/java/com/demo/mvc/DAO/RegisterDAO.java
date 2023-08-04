package com.demo.mvc.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.mvc.DTO.UserDTO;

public interface RegisterDAO extends CrudRepository<UserDTO, Integer>{
	List<UserDTO> findByName(String name);
	List<UserDTO> findByAge(int age);
	List<UserDTO> findByAgeGreaterThan(int age);
	
	@Query("from UserDTO where age=?1 order by name")
	List<UserDTO> findByAgeSortName(int age);
}

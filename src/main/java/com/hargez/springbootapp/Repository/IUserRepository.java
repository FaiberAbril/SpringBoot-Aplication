package com.hargez.springbootapp.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hargez.springbootapp.Models.UserModel;


@Repository
public interface IUserRepository extends JpaRepository<UserModel, Integer> {

	Optional<UserModel> findByusername(String username);
	
	Optional<UserModel> findByIdAndPassword(int id,String password);
	  
}

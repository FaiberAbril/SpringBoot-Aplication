package com.hargez.springbootapp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hargez.springbootapp.Models.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, Integer> {

	public Optional<UserModel> finbyname(String nombre);
	public Optional<UserModel> finbyidandname(int id, String nombre);
	  
}

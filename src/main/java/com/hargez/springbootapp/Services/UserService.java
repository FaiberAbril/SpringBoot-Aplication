package com.hargez.springbootapp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hargez.springbootapp.Models.UserModel;
import com.hargez.springbootapp.Repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository iUserRepository;
	
	
	public List<UserModel> listall(){
		return iUserRepository.findAll();
	}
	
	public Optional<UserModel> listarbyId(int id) {
		return iUserRepository.findById(id);
	}
	
	public Optional<UserModel> listarbyUsername(String username) {
		return iUserRepository.findByusername(username);
	}
	

	public Optional<UserModel> listarbyId(int id,String password) {
		return iUserRepository.findByIdAndPassword(id, password);
	}
	
	public void guardar(UserModel user) {
		iUserRepository.save(user);
	}
	
	
	public void deletebyid(int id) {
		iUserRepository.deleteById(id);
	}
	
	
}

package com.hargez.springbootapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hargez.springbootapp.Models.RolModel;
import com.hargez.springbootapp.Repository.IRolRepository;

@Service
public class RolService {
	
	@Autowired
	private IRolRepository iRolRepository;
	
	public List<RolModel> listall(){
		return iRolRepository.findAll();
	}
}

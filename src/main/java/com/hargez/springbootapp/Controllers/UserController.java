package com.hargez.springbootapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hargez.springbootapp.Models.UserModel;
import com.hargez.springbootapp.Services.RolService;
import com.hargez.springbootapp.Services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	
	
	@Autowired
	private RolService rolservice;
	
	//metodo para  pagina de inicio 
	@GetMapping({"/","login"})
	public String index() {
		return "index"; 
	}
	
	//Administrar Usuario 
	@GetMapping("/userForm")
	public String userForm(Model model) {
		model.addAttribute("userForm",new UserModel());
		model.addAttribute("roles", rolservice.listall());
		model.addAttribute("userList", userservice.listall());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}

	
	
	
	
}

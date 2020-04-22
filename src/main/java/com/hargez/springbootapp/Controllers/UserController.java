package com.hargez.springbootapp.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

	
	@PostMapping("/userForm")
	public String  createUser(@Valid @ModelAttribute("userForm")UserModel user,BindingResult resul,ModelMap model) {
		
		if(resul.hasErrors()) {
			model.addAttribute("UserForm",user);
			model.addAttribute("formTab", "active");
		}else {
				try {
					model.addAttribute("userForm",new UserModel());
					model.addAttribute("listTab","active");
					userservice.guardar(user);
				} catch (Exception e) {
					model.addAttribute("formError",e.getMessage());
					model.addAttribute("UserForm",user);
					model.addAttribute("formTab","active");
					model.addAttribute("listTab","desactive");
					}	
			
		}
		
		
		model.addAttribute("roles", rolservice.listall());
		model.addAttribute("userList", userservice.listall());
		return "user-form/user-view";
	}
	
	
	
	
	
	
	
}

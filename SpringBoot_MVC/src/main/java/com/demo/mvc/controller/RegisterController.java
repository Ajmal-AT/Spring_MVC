package com.demo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.mvc.DAO.RegisterDAO;
import com.demo.mvc.DTO.UserDTO;

@Controller
public class RegisterController {
	@Autowired
	private RegisterDAO dao;
	
	@RequestMapping("/reg")
	public String register() {
		//System.out.println(dao.findByName("Ajmal A T"));
		//System.out.println(dao.findByAge(22));
		//System.out.println(dao.findByAgeSortName(21));
		System.out.println(dao.findByAgeGreaterThan(21));
		return "register";
	}
	
	@RequestMapping("/home")
	public String registerHome(UserDTO dto) {
		dao.save(dto);
		return "home";
	}
	
	@RequestMapping("/view")
	public String viewoption() {
		return "View";
	}
	
	@RequestMapping("/viewByid")
	public String viewbyid() {
		return "viewByid";
	}

}

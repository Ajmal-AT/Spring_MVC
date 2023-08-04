package com.demo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.mvc.DAO.RegisterDAO;
import com.demo.mvc.DTO.UserDTO;
import com.demo.mvc.DTO.ViewIdDTO;

@Controller
public class ViewIdController {
	@Autowired
	private RegisterDAO dao;
	
	@RequestMapping("/displayId")
	public ModelAndView viewId(ViewIdDTO vdto) {
		int id = vdto.getU_id();
		UserDTO data = dao.findById(id).orElse(null);
		System.out.println(data);
		return new ModelAndView("displayId","data",data);
	}
	
	@RequestMapping("/viewAl")
	public ModelAndView viewAlldetails(UserDTO dto) {
		List<UserDTO> data = (List<UserDTO>) dao.findAll();
		System.out.println(data);
		return new ModelAndView("viewAll","data",data);
	}
}

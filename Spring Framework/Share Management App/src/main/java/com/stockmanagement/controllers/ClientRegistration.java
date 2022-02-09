package com.stockmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stockmanagement.beans.ClientRegistrationBean;
import com.stockmanagement.dao.ClientRegistrationDAO;

@Controller
public class ClientRegistration {
	
	@Autowired
	ClientRegistrationDAO clientRegistrationDAO;
	
	@RequestMapping("/ClientRegistration")
	public String crp(Model m) {
		m.addAttribute("command", new ClientRegistrationBean() );
		return "Client/RegistrationForm";
	}
	
	
	@RequestMapping("Client/Register")
	public String register(@ModelAttribute("clientRegistrationModel") ClientRegistrationBean clientRegistrationBean) {
		
		clientRegistrationDAO.save(clientRegistrationBean);
		
		return "Client/Data";
	}
	

}

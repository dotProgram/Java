package com.stockmanagement.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stockmanagement.beans.ClientLoginBean;
import com.stockmanagement.beans.ClientRegistrationBean;
import com.stockmanagement.dao.ClientLoginDAO;
import com.stockmanagement.dao.ClientRegistrationDAO;

@Controller
public class ClientLogin {
//	HttpServletRequest request;
	HttpSession session;
	
	
	  public ClientLogin(HttpServletRequest request, HttpSession session) { 
		  //this.request = request; 
		  this.session = session; 
		  //this.session = request.getSession(); 
		  }
	 
	@Autowired
	ClientLoginDAO clientLoginDAO;

	/*
	 * @Autowired HttpServletRequest request;
	 * 
	 * @Autowired HttpSession session=request.getSession();
	 */
	@RequestMapping("/ClientLogin")
	public String crp(Model m) {
		m.addAttribute("command", new ClientRegistrationBean() );
		m.addAttribute("model_session_first_name", this.session.getAttribute("session_first_name"));
		
		return "Client/Login";
	}
	
	
	@RequestMapping("Client/Login")
	public String register(@ModelAttribute("clientRegistrationModel") ClientRegistrationBean clientRegistrationBean) {
		
		
		clientRegistrationBean.getPassword();
		
		//clientLoginDAO.checkForEmailID(clientRegistrationBean.getEmailAddress());
		System.out.println(clientLoginDAO.checkForEmailID(clientRegistrationBean.getEmailAddress()));
		return "Client/Data";
	}
	
	@RequestMapping("Client/Login2")
	public String login(@ModelAttribute("clientRegistrationModel") ClientRegistrationBean clientRegistrationBean) {
		
		List<ClientLoginBean> crb;
		//;
		crb = clientLoginDAO.getClient(clientRegistrationBean.getEmailAddress());

		crb.forEach(
				(n) -> { 
					
					System.out.println(n.getEmailAddress()+" "+n.getPassword()+" "+n.getFirstName());
				this.session.setAttribute("session_first_name", n.getFirstName());
				
				}
				
				
				);
		

		//clientLoginDAO.checkForEmailID(clientRegistrationBean.getEmailAddress());
		//System.out.println(clientLoginDAO.checkForEmailID(clientRegistrationBean.getEmailAddress()));
		return "Client/Data";
	}
	

}

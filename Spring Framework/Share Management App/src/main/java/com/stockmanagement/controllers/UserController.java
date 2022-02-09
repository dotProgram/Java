package com.stockmanagement.controllers;   
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmanagement.beans.User;
import com.stockmanagement.dao.UserDao;


@Controller  
public class UserController { 
	/**
	 * 
	 */
	public UserController() {
	
		System.out.println(" UserController got initilized...");	
		}	
	
     //@Autowired(required =false)
     @Autowired()       
	 UserDao daoUser;//will inject/CREATE DAO from XML file  
	
	
   
      
    /*It displays a form to input data, here "command" is a reserved request attribute which is used to display object data into form */  
    @RequestMapping("/pages/Userform")  
    public String showformUser(Model m){  
    	m.addAttribute("command", new User());
    //	 HttpSession session = null;
    //	 session.setAttribute("ses", session);
    	return "/pages/Userform"; 
    } 
    
    /*It saves object into database. The @ModelAttribute puts request data *  into model object. You need to mention RequestMethod.POST method *  because default request is GET*/  
 
    @RequestMapping(value="/pages/Usersave",method = RequestMethod.POST)  
    public String saveUser(@ModelAttribute("emp") User userBean){  
    	daoUser.save(userBean);  
        return "redirect:/viewemp";//will redirect to viewemp request mapping  
    } 
    
    /* It provides list of employees in model object */  
    @RequestMapping("/pages/viewUsers")  
    public String viewUser(Model m){  
        List<User> list=daoUser.getUser();  
        m.addAttribute("list",list);
        return "/pages/viewUsers";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/pages/Useredit/{id}")  
    public String editUser(@PathVariable int id, Model m){  
        User userBean=daoUser.getUserById(id);  //SQL Query to retrieve details based on ID gets executed
        m.addAttribute("command",userBean);
        return "/pages/Userseditform";  
    }  
    
    /* It updates model object.model.addAttribute  */ 
    
   // @ModelAttribute
    @RequestMapping(value="/pages/Usereditsave", method = RequestMethod.POST)  
   // public String editUsersave(Model model1){
       public String editUsersave(User userBean){
    	System.out.println("/pages/Usereditsave");	
    	//User userBean = new User();
    	
    	// model1.addAttribute("emp",userBean);
    	daoUser.update(userBean);  
    	System.out.println("daoUser.update(userBean)");	
        //return "redirect:/pages/viewUsers";
        //return "/pages/viewUsers";
        System.out.println("return /pages/viewUsers");	
        return "redirect:/user";  
    }  
    
    
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/pages/deleteUser/{id}",method = RequestMethod.GET)  
    public String deleteUser(@PathVariable int id){  
    	daoUser.delete(id);  
        return "redirect:/pages/viewUsers";  
    }
    
    
    /*
		Self Practice Starts
     */  
    @RequestMapping("/user")  
    public String showform2(Model m){ 
    	
    	//                |*>====== >> "daoUser" is the {Bean ID/ Bean Object Name} managed by Spring Container 
    	//                |*|          "declared in" the Dispatch-Servlet.XML
    	//                |*|
    	//                |*|           @Autowired  
    	//                |*|           UserDao daoUser;
    	
    	List<User> list=daoUser.getUser();
    	
        m.addAttribute("list",list);
        
    	return "pages/viewUsers"; 
    }   
    
    
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteUser/{id}",method = RequestMethod.GET)  
    public String deleteUsers(@PathVariable int id){  
    	daoUser.delete(id);  
        return "redirect:/user";  
    }
    
    
    /*
		Self Practice Ends
     */    
}  
package com.stockmanagement.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmanagement.beans.Emp;
import com.stockmanagement.dao.EmpDao;


@Controller  
public class EmpController { 
	public EmpController() {
	
		System.out.println("EmpController got initilized...");	
		}	
	
		/*
		 *< Commenting the Autowired for the EmpDao
		 */
	
	@Autowired  
    EmpDao daoBean;//will inject dao from xml file  
    
	    @RequestMapping("/")  
	    public String home(Model m){  
	    	//m.addAttribute("command", new Emp());
	    	return "index"; 
	    } 
      
    /*It displays a form to input data, here "command" is a reserved request attribute which is used to display object data into form */  
    @RequestMapping("/empform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Emp());
    	return "empform"; 
    } 
    
    /*It saves object into database. The @ModelAttribute puts request data *  into model object. You need to mention RequestMethod.POST method *  because default request is GET*/  
 
    @RequestMapping(value="/save",method = RequestMethod.POST)  
   // public String save(@ModelAttribute("emp") Emp emp){
     public String save(Emp emp){ 
           System.out.println("Emp save  = ");	      
    	daoBean.save(emp);  
        return "redirect:/viewemp";//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewemp")  
    public String viewemp(Model m){  
        List<Emp> list=daoBean.getEmployees();  
        m.addAttribute("list",list);
        return "viewemp";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editemp/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Emp emp=daoBean.getEmpById(id);  
        m.addAttribute("command",emp);
        return "empeditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
   // public String editsave(@ModelAttribute("emp") Emp emp){
        public String editsave(Emp emp){ 
    	daoBean.update(emp);  
        return "redirect:/viewemp";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
    	daoBean.delete(id);  
        return "redirect:/viewemp";  
    }
    
    
    /*
		Self Practice Starts
      
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
    /*
    @RequestMapping(value="/deleteUser/{id}",method = RequestMethod.GET)  
    public String deleteUsers(@PathVariable int id){  
    	daoUser.delete(id);  
        return "redirect:/user";  
    }
    
    @RequestMapping("/hp")  
    public String k(Model m){  
    	List<Emp> list=daoBean.getEmployees();  
        m.addAttribute("list",list);
    	return "kappa/kappa"; 
    }  
    
    */
    /*
		Self Practice Ends
     */    
}  
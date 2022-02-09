package com.stockmanagement.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmanagement.beans.ConfirmEmpFormBean;
import com.stockmanagement.dao.EmpDaoFormConfirm;


@Controller
public class ConfirmEmpFormController { 
	public ConfirmEmpFormController() {
		System.out.println("\n ==================");		
		System.out.println(" \n ConfirmEmpFormController got initilized...");	
		System.out.println("==================—–-— \n");	
	}	
		/*	
			EmpDaoFormConfirm daoEmpDaoFormConfirm = new EmpDaoFormConfirm();
			ConfirmEmpFormBean ConfirmEmpFormBean = new ConfirmEmpFormBean();
	 */  
		@Autowired 
		 EmpDaoFormConfirm daoEmpDaoFormConfirm;//will inject dao from xml
		
		ModelMap mesmesdsagesage = new ModelMap();
	  
			// ConfirmEmpFormBean
	    /*
	     * It displays a form to input data, here "command" is a reserved request attribute which 
	     * is used to display object data into form 
	     * 
	    */@RequestMapping("/confirmForm/viewemp")  
	    public String homeform(Model m){  
	        List<ConfirmEmpFormBean> listconfirmForm= daoEmpDaoFormConfirm.getEmployees();
	       // System.out.println("Emp /confirmForm List = "+listconfirmForm);
	       String messae= (String) mesmesdsagesage.get("mess");
	       String html= (String) mesmesdsagesage.get("html");
	        m.addAttribute("messae",messae);
	        m.addAttribute("html",html);
	        m.addAttribute("list",listconfirmForm);
	        //mesmesdsagesage.addAttribute("mess", "Record Tamperted");
	       // mesmesdsagesage.get("mess").clear();
	        mesmesdsagesage.clear();
	        
	        return "/confirmForm/viewemp"; 
	    } 
	 
      
    /* 
     * It displays a form to input data, here "command" is a reserved request attribute which is 
       used to display object data into form 
    */  
    @RequestMapping("/confirmForm/newEmpForm")  
    public String showform(Model m){  
    	m.addAttribute("command", new ConfirmEmpFormBean());
    	return "/confirmForm/newEmpForm"; 
    } 
    
    
    @RequestMapping(value="/confirmForm/confirmSave",method = RequestMethod.POST)  
   // public String save(@ModelAttribute("emp") Emp emp){
     public String confirmSave(ConfirmEmpFormBean emp, Model confirmSave){
    	System.out.println("RequestMapping  = /confirmForm/confirmSave \n ");
    	
    	 //  Model confirmSave;
    	//   confirmSave.addAttribute("confirmSaveModel", confirmSave.get("command"));
    	
    	     confirmSave.addAttribute("command", emp);
    	     confirmSave.addAttribute("id", emp.getId());
    	     confirmSave.addAttribute("name", emp.getName());
    	     confirmSave.addAttribute("designation", emp.getDesignation());
    	     confirmSave.addAttribute("salary", emp.getSalary());
    	     
    	//   List<ConfirmEmpFormBean> list=command;
        //   System.out.println("Model emp.getName()  = \n "+emp.getName());	
        //   System.out.println("Model confirmSave  = \n "+confirmSave.command);	
        //   daoEmpDaoFormConfirm.save(emp);  
        //   return "redirect:/confirmForm/confirmEmpForm";//will redirect to viewemp request mapping  
    	     return "/confirmForm/confirmEmpForm";
    }  
    
    
    @RequestMapping(value="/confirmForm/editemp")  
    public String edit(ConfirmEmpFormBean phirSaiEditkaro, Model editemp){  
        System.out.println("   modelElementsToSave save - modelElementsToSave.getName()  = "+phirSaiEditkaro.getName());	
        System.out.println("   modelElementsToSave save - getSalary                      = "+phirSaiEditkaro.getSalary());	 
        editemp.addAttribute("command", phirSaiEditkaro);
        //From Here The view editemp&{id} and DB receives Dublicate Data
        
      //  m.addAttribute("commandLLL", phirSaiEditkaro); 
        //return "/confirmForm/confirmEmpForm";
       return "/confirmForm/empeditform2";  
    } 
    
   @RequestMapping(value="/confirmForm/editemp&{id}")  
    public String edit(@PathVariable int id, Model m){  
    	ConfirmEmpFormBean emp = daoEmpDaoFormConfirm.getEmpById(id); 
    	System.out.println("int id value = "+id);	
        m.addAttribute("command",emp);
        return "/confirmForm/empeditform";  
    } 
    
    
  
    @RequestMapping(value="/confirmForm/confirmSave&{id}",method = RequestMethod.POST)  
   // public String save(@ModelAttribute("emp") Emp emp){
     public String confirmSave2(ConfirmEmpFormBean emp2, ModelMap confirmSave_2){
    	System.out.println("RequestMapping  = confirmSave&{id} \n ");
    	//confirmSave_2.addAttribute("commandy", emp2);
   	     confirmSave_2.addAttribute("id", emp2.getId());
	     confirmSave_2.addAttribute("name", emp2.getName());
	     confirmSave_2.addAttribute("designation", emp2.getDesignation());
	     confirmSave_2.addAttribute("salary", emp2.getSalary());
    	 confirmSave_2.addAttribute("command", emp2);

    	 System.out.println("----------emp.getId()           = "+emp2.getId());	
	     System.out.println("-------  -emp.getName()         = "+emp2.getName());	
	     System.out.println("----------emp.getDesignation()  = "+emp2.getDesignation());	
	     System.out.println("--------  emp.getSalary()       = "+emp2.getSalary());	
	     return "/confirmForm/confirmEmpForm";
    }  
     
    
    
    /*
     * It saves object into database. The @ModelAttribute puts request data *  
     * into model object. You need to mention RequestMethod.POST method *  
     * because default request is GET
     * */  
      @RequestMapping(value="/confirmForm/save",method = RequestMethod.POST)  
    //public String save(@ModelAttribute("emp") Emp emp){
      public String save(ConfirmEmpFormBean modelElementsToSave, ModelMap lo ){ 
         
    	  // System.out.println("\n modelElementsToSave save > modelElementsToSave.getName()  = "+modelElementsToSave.getName());	
         //  System.out.println(" modelElementsToSave save > getSalary  = "+modelElementsToSave.getSalary());	
    	  //@ModelAttribute("emp");
       //   ModelMap mesdsage. =2;
    	  mesmesdsagesage.addAttribute("mess", "Record Saved Successfully");
    	  /*
           modelElementsToSave.setId();
           modelSave.addAttribute("command", modelElementsToSave);
           modelSave.addAttribute("id", modelElementsToSave.getId());
           modelSave.addAttribute("name", modelElementsToSave.getName());
           modelSave.addAttribute("designation", modelElementsToSave.getDesignation());
           */
    	  
           daoEmpDaoFormConfirm.save(modelElementsToSave);  
          
        return "redirect:/confirmForm/viewemp";//will redirect to viewemp request mapping  
    }  
      
    /* It provides list of employees in model object */  
    @RequestMapping("/confirmForm/viewemp2")  
    public String viewemp(Model m){  
        List<ConfirmEmpFormBean> list=daoEmpDaoFormConfirm.getEmployees();  
        System.out.println("Emp confirmForm/viewemp List = "+list);	
        m.addAttribute("list",list);
        return "/confirmForm/viewemp";  
    }  

   /* It updates model object. */  
    @RequestMapping(value="/confirmForm/editsave",method = RequestMethod.POST)  
   // public String editsave(@ModelAttribute("emp") Emp emp){
        public String editsave(ConfirmEmpFormBean emp){ 
    	daoEmpDaoFormConfirm.update(emp);  
        return "redirect:/confirmForm/viewemp";  
    }  
    
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/confirmForm/deleteemp/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id,  ModelMap lov){  
    	daoEmpDaoFormConfirm.delete(id); 
    	mesmesdsagesage.addAttribute("mess", "Record Deleted Successfully"); 
    	//mesmesdsagesage.addAttribute("html", "<div  class=\"alert alert-success alert-dismissible fade show\"> Record Deleted Successfully 2 </div>");
    	 return "redirect:/confirmForm/viewemp";//will redirect to viewemp request mapping
    }
    
    
     
}  
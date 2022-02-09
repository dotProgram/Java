package com.stockmanagement.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stockmanagement.beans.Notes;
import com.stockmanagement.dao.NotesDAO;

@RequestMapping("/notes")  
@Controller  
public class NotesController { 

	 @Autowired  
	 NotesDAO NotesDAO_IOC_BEAN;//will inject dao from xml file  
    
	    
	 @RequestMapping("/")  
	    public String home(Model m){  
	    	//m.addAttribute("command", new Emp());
		 List<Notes> list = NotesDAO_IOC_BEAN.getNotes();  
	        m.addAttribute("list",list);
	    	return "notes/viewnotes"; 
	    } 
      
   
    /* It provides list of employees in model object 
    @RequestMapping("/viewemp")  
    public String viewemp(Model m){  
        List<Notes> list = notesNotesDAO.getNotes();  
        m.addAttribute("list",list);
        return "/viewnotes";  
    }  */  
	 
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.
    @RequestMapping(value="/editemp/{id}")  
    public String edit(@PathVariable int id, Model m){  
    	Notes notesBean = notesNotesDAO.getEmpById(id);  
        m.addAttribute("command",emp);
        return "empeditform";  
    }  
    */  
}  
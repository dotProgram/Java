package com.stockmanagement.controllers;   
import java.text.NumberFormat;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmanagement.beans.StockDetailsBean;
import com.stockmanagement.dao.StockDao;
//import com.stockmanagement.services.StockValuation;
import com.stockmanagement.services.StockValuation;
import com.stockmanagement.services.RupeeToWords;

@RequestMapping("/stockManagement")  
@Controller  
public class StockController { 
	public StockController() {
		
		System.out.println(" StockController got initilized...");	
		}	
	RupeeToWords o = new RupeeToWords();
	
	@Autowired  
	StockDao _stockDao ;//will inject dao from xml file  
    
	@Autowired  
	HttpServletRequest request ;
	
	@Autowired
	HttpServletResponse response;

	
	
	//StockDao _stockDao = new StockDao();//will inject dao from xml file  
	    @RequestMapping("/")  
	    public String home(Model m){  

	 //m.addAttribute("command", new StockDetailsBean());
	    	return "stockManagement/viewStocks"; 
	    } 
	    
	    /* It provides list of employees in model object */  
	    @RequestMapping("/viewStock")  
	    public String viewStock(Model m){  
	        List<StockDetailsBean> list=_stockDao.getStock();  
	        m.addAttribute("list",list);
	        return "stockManagement/viewStocks";  
	    }
     
	    /* It provides list of employees in model object */  
	    @RequestMapping("/addNewStock")  
	  //  public String addStock(@ModelAttribute StockDetailsBean _stockDetailsBean, Model m){  //
	    	public String addStock(Model m){
	    //    List<StockDetailsBean> list=_stockDao.getStock();  
	    	  //m.addAttribute("_stockDetailsBean",_stockDetailsBean);
	    	//  m.addAttribute("command", new ConfirmEmpFormBean());
	    	  m.addAttribute("command", new StockDetailsBean() );
	        return "stockManagement/addNewStock";  
	    }
	    
	    
	    /* It provides list of employees in model object */  
	    @RequestMapping("viewStock2")  
	    public String viewStock2(Model m){  
	        List<StockDetailsBean> list=_stockDao.getStock();  
	        m.addAttribute("list",list);
	        
	        // Without Auto-Wiring, request.getRemoteHost() is 'null'
	    	try {
				System.out.println(request.getRemoteHost());
				m.addAttribute("getRemoteHost", request.getRemoteHost());
				HttpSession session = request.getSession();
				m.addAttribute("session", request.getSession());
				session.setAttribute("s1",list.get(3));
				
				m.addAttribute("session_value", session);
	    		} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	
	        return "stockManagement/viewStocks2";  
	    }   
	    
	    @RequestMapping(value="/viewStock2/details/{id}")  
	    public String stockDetail(@PathVariable int id, Model m){  
	     
	    	StockDetailsBean stockDetailsBean=_stockDao.getStockById(id);  
	    	m.addAttribute("command",stockDetailsBean);
	    	return "stockManagement/stockDetails";  
	    } 
	    
	   
	    @RequestMapping(value="/evaluate")  
	    public String stockDetail( @ModelAttribute StockDetailsBean _stockDetailsBean, Model m){  
	    //	StockValuation objectOfStockValuation = new StockValuation();
	    	
	    	System.out.println("------------------------<          >------------------");	
	    	System.out.println("RequestMapping value = calculate ");	
	
	        // m.addAttribute("command",new StockDetailsBean());
	    	 long NumberOfStocks =(long) _stockDetailsBean.getNumberOfStocks();
	         double StockPriceAtTheTimeOfPurchase = _stockDetailsBean.getStockPriceAtTheTimeOfPurchase();
	         double CurrentStockPrice = _stockDetailsBean.getCurrentStockPrice();
	    //	String messae= (String) m.get("numberOfStocks");
	    //	String messae2= (String) m.get("stockSector");	
	    	
	    	System.out.println("NumberOfStocks  = "+_stockDetailsBean.getNumberOfStocks());	
	    	System.out.println("getStockPriceAtTheTimeOfPurchase  = "+_stockDetailsBean.getStockPriceAtTheTimeOfPurchase());	
	    	System.out.println("currentStockPrice  = "+_stockDetailsBean.getCurrentStockPrice());
	    	
	    	//"Cal of Service  = "+resultOfCalculation);
	    	float resultOfCalculation = StockValuation.netValuation(CurrentStockPrice, StockPriceAtTheTimeOfPurchase,NumberOfStocks );
	    	System.out.println("Cal of Service  = "+resultOfCalculation);
	    	
	    	System.out.println("StockPriceAtTheTimeOfPurchase  = "+(StockPriceAtTheTimeOfPurchase * NumberOfStocks));
	    	
	    	m.addAttribute("stockResult",NumberFormat.getInstance().format(resultOfCalculation));
	    	m.addAttribute("StockPriceAtTheTimeOfPurchase", NumberFormat.getInstance().format(StockPriceAtTheTimeOfPurchase));
	    	m.addAttribute("TotalInvestmentInStockAtTheTimeOfPurchase",(StockPriceAtTheTimeOfPurchase * NumberOfStocks));
	    	m.addAttribute("totalInvestmentInStockAtTheTimeOfPurchaseToWords",o.convertRupeeToWords((int)Math.abs(StockPriceAtTheTimeOfPurchase * NumberOfStocks)));
	    	m.addAttribute("NumberOfStocks",NumberOfStocks);
	    	m.addAttribute("CurrentStockPrice",CurrentStockPrice);
	    	m.addAttribute("CurrentStockPriceForAll",(CurrentStockPrice * NumberOfStocks));
	    	m.addAttribute("totalInvestmentInStockAtPresentToWords",o.convertRupeeToWords((int)Math.abs(CurrentStockPrice * NumberOfStocks)));
	    	m.addAttribute("StockNameTitle",_stockDetailsBean.getStockNameTitle());
	    	m.addAttribute("amountToWords",o.convertRupeeToWords((int)Math.abs(resultOfCalculation)));
	    	
	    	
	    	
	    	if(resultOfCalculation > 0) {
	    		m.addAttribute("IconBootstrapForPoL","glyphicon glyphicon-arrow-up");
		    	
	    	}
	    	else {
	    		m.addAttribute("IconBootstrapForPoL","glyphicon glyphicon-arrow-down");
	    	}
	    	
	    	System.out.println("StockNameTitle "+(String)_stockDetailsBean.getStockNameTitle());
	    	System.out.println("------------------------<          >------------------");
	    	System.out.println(NumberFormat.getInstance().format(resultOfCalculation));
	        return "stockManagement/stockNetWorth";  
	    }    
	
	    
	    @RequestMapping(value="/calculate2")  
	    public String stockDetail2( @ModelAttribute StockDetailsBean _stockDetailsBean, Model command){  
	    //	StockValuation objectOfStockValuation = new StockValuation();
	    	
	    	System.out.println("------------------------<          >------------------");	
	    	System.out.println("RequestMapping value = calculate ");	
	
	        // m.addAttribute("command",new StockDetailsBean());
	         double NumberOfStocks =_stockDetailsBean.getNumberOfStocks();
	         double StockPriceAtTheTimeOfPurchase = _stockDetailsBean.getStockPriceAtTheTimeOfPurchase();
	         double CurrentStockPrice = _stockDetailsBean.getCurrentStockPrice();
	    //	String messae= (String) m.get("numberOfStocks");
	    //	String messae2= (String) m.get("stockSector");	
	    	
	    	System.out.println("NumberOfStocks  = "+_stockDetailsBean.getNumberOfStocks());	
	    	System.out.println("getStockPriceAtTheTimeOfPurchase  = "+_stockDetailsBean.getStockPriceAtTheTimeOfPurchase());	
	    	System.out.println("currentStockPrice  = "+_stockDetailsBean.getCurrentStockPrice());
	    	
	    	//"Cal of Service  = "+resultOfCalculation);
	    	float resultOfCalculation = StockValuation.netValuation(CurrentStockPrice, StockPriceAtTheTimeOfPurchase,NumberOfStocks );
	    	System.out.println("Cal of Service  = "+resultOfCalculation);
	    	System.out.println("StockPriceAtTheTimeOfPurchase  = "+(StockPriceAtTheTimeOfPurchase * NumberOfStocks));
	    	
			
			/*
			 * command.addAttribute("stockResult",resultOfCalculation);
			 * command.addAttribute("StockPriceAtTheTimeOfPurchase",
			 * StockPriceAtTheTimeOfPurchase);
			 */ 
			   command.addAttribute("TotalInvestmentInStockAtTheTimeOfPurchase",(
			   StockPriceAtTheTimeOfPurchase * NumberOfStocks));
			   /*
			 * command.addAttribute("NumberOfStocks",NumberOfStocks);
			 * command.addAttribute("CurrentStockPrice",CurrentStockPrice);
			 * command.addAttribute("CurrentStockPriceForAll",(CurrentStockPrice *
			 * NumberOfStocks));
			 * command.addAttribute("StockNameTitle",(String)_stockDetailsBean.
			 * getStockNameListed( ));
			 */
	    	
				    	if(resultOfCalculation > 0) {
				    		command.addAttribute("IconBootstrapForPoL","glyphicon glyphicon-arrow-up");
					    	
				    	}
				    	else {
				    		command.addAttribute("IconBootstrapForPoL","glyphicon glyphicon-arrow-down");
				    	}
				    	
	    	System.out.println("StockNameTitle "+(String)_stockDetailsBean.getStockNameTitle());
	    	System.out.println("------------------------<          >------------------");
	    	System.out.println(_stockDetailsBean);
	        return "stockManagement/stockNetWorth2";  
	    }    
	
	    
    /*It displays a form to input data, here "command" is a reserved request attribute which is used to display object data into form */  
    @RequestMapping("/Stockform")  
    public String showformStock(Model m){  
    	m.addAttribute("command", new StockDetailsBean());
    	return "empform"; 
    } 
    
 
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editStock/{id}")  
    public String editStock(@PathVariable int id, Model m){  
        StockDetailsBean _stockDetailsBean=_stockDao.getStockById(id);  
        m.addAttribute("command",_stockDetailsBean);
        return "stockManagement/editStockDetails";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsaveStock",method = RequestMethod.POST)  
   // public String editsaveStock(@ModelAttribute("emp") StockDetailsBean _stockDetailsBean){
        public String editsaveStock(StockDetailsBean _stockDetailsBean){ 
    //	_stockDao.update(_stockDetailsBean);  
        return "redirect:/viewemp";  
    }  
    /*It saves object into database. The @ModelAttribute puts request data *  into model object. You need to mention RequestMethod.POST method *  because default request is GET*/  
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
   // public String save(@ModelAttribute("emp") StockDetailsBean _stockDetailsBean){
     public String saveStock(@ModelAttribute StockDetailsBean _stockDetailsBean){ 
           System.out.println("Emp save  Method invoked ");	      
           _stockDao.save(_stockDetailsBean);  
        return "redirect:/stockManagement/viewStock2";//will redirect to viewemp request mapping  
    }  
   
    @RequestMapping(value="/update",method = RequestMethod.POST)  
   // public String save(@ModelAttribute("emp") StockDetailsBean _stockDetailsBean){
     public String updateStock(StockDetailsBean _stockDetailsBean){ 
           System.out.println("Emp update  = ");	      
           _stockDao.update(_stockDetailsBean);  
           int profileId = _stockDetailsBean.getId();
        return "redirect:/stockManagement/viewStock2/details/"+profileId;//will redirect to viewemp request mapping  
    }  
   
    
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteStock/{id}",method = RequestMethod.GET)  
    public String deleteStock(@PathVariable int id){  
    	_stockDao.delete(id);  
        return "redirect:/viewemp";  
    }
    
    
  
}  
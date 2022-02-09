package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.stockmanagement.beans.StockDetailsBean;
  
public class StockDao { 

  //@Autowired
  JdbcTemplate template;
  
  public StockDao() {
	  System.out.println("*********             ************          *********"); 
	  System.out.println("*********             JdbcTemplate template          *********"); 
	  System.out.println("*********             ************          *********"); 
  }


	
	   public void setTemplate(JdbcTemplate template) { this.template = template;
	   System.out.println(this.template); 
	   }
	 
 


public int save(StockDetailsBean p){  
  // String sql="insert into stockdetail(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
   
   String sql2="insert into stockdetail(stockName,stockNameListed,stockNameTitle,stockDiscription,stockSector,"
   		+ "stockPriceAtTheTimeOfPurchase,"
   		+ "stockDateOfPurchase,currentStockPrice,numberOfStocks,idOfStockHolder)"
   		+ "values('"+p.getStockNameTitle()+"','"+p.getStockNameListed()+"','"+p.getStockNameTitle()+"','"+p.getStockDiscription()+"','"+
 		  p.getStockSector()+"','"+p.getStockPriceAtTheTimeOfPurchase()+"','"+ p.getStockDateOfPurchase()+"','"+
 		  p.getCurrentStockPrice()+"','"+p.getNumberOfStocks()+"',"+88+")"; 
   int statusOfSave = template.update(sql2);
   System.out.println("statusOfSave: "+statusOfSave);	
   return statusOfSave;  
	//return 0;
}  


  public int update(StockDetailsBean p){

  
	  String sql="update stockdetail set stockNameListed='"+p.getStockNameListed()+"', stockNameTitle='"+
	  p.getStockNameTitle()+"',stockDiscription='"+p.getStockDiscription()+"' ,stockSector='"+p.getStockSector()
	  +"',stockPriceAtTheTimeOfPurchase='"+p.getStockPriceAtTheTimeOfPurchase()+"'  ,stockDateOfPurchase='"+
	  p.getStockDateOfPurchase()+"',currentStockPrice='"+p.getCurrentStockPrice()+"',numberOfStocks='"+
	  p.getNumberOfStocks()+"' where id="+p.getId()+""; 
  
  //return
  template.update(sql); int statusOfUpdate = template.update(sql);
  System.out.println("Emp Update Status = "+statusOfUpdate); return
  statusOfUpdate; }
 

public int delete(int id){  
    String sql="delete from stockdetail where id="+id+"";  
    return template.update(sql);  
}  
public StockDetailsBean getStockById(int id){  
    String sql="select * from stockdetail where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<StockDetailsBean>(StockDetailsBean.class));  
}  
int list_MapRow_loop=1;
int template_query_loop=1;
public List<StockDetailsBean> getStock(){  
    //return template.query("select * from stockdetail",new RowMapper<StockDetailsBean>(){  
	 return template.query("select * from stockdetail",new RowMapper<StockDetailsBean>(){
	
        public StockDetailsBean mapRow(ResultSet rs, int row) throws SQLException {  
        	System.out.println("kkG list_MapRow_loop No: "+list_MapRow_loop);	
        	StockDetailsBean e = new StockDetailsBean();  
            e.setId(rs.getInt(1)); 
            e.setStockNameTitle(rs.getString(4));
            e.setStockNameListed(rs.getString(3)); 
            e.setStockDiscription(rs.getString(5));
            e.setStockSector(rs.getString(6)); 
            e.setStockPriceAtTheTimeOfPurchase(rs.getDouble(7)); 
            e.setStockDateOfPurchase(rs.getString(8)); 
            e.setCurrentStockPrice(rs.getDouble(9)); 
            e.setNumberOfStocks(rs.getDouble(10)); 
            e.setIdOfStockHolder(rs.getInt(11)); 
            list_MapRow_loop++;
            return e;  
        }  
    });  
}  
}  
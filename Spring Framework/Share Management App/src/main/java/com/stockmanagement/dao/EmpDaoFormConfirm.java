package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.stockmanagement.beans.ConfirmEmpFormBean;
  
public class EmpDaoFormConfirm { 
	public EmpDaoFormConfirm() {
		try {
		ConfirmEmpFormBean whenOrIfInvoked;
		
		// TODO Auto-generated constructor stub
		  System.out.println("****************************************** ");
		  System.out.println("******************** ");
		  System.out.println("********* ");
		  System.out.println("**** ");
		  System.out.println("Constructor of EmpDaoFormConfirm DAO invoked");
		 

		  System.out.println("**** ");
		  System.out.println("********* ");	  
		  System.out.println("******************** ");
		  System.out.println("****************************************** ");

		} catch (Exception e) {
			System.out.println(e);
		}
		}	

	//EmpDaoFormConfirm daoEmpDaoFormConfirm = new EmpDaoFormConfirm();	
	//@Autowired 	
  //  JdbcTemplate jt;  
  

  
  
  
  JdbcTemplate template;
  public void setTemplate(JdbcTemplate template) {
  
  System.out.println("\\------------------------------------------\\ \n");
  System.out.println("setTemplate(JdbcTemplate template) {");
  System.out.println("setting value of template via *this.template* EmpDaoFormConfirm-DAO");
  System.out.println("****************************************** ");
  this.template = template; //System.out.println(this.template);
 // System.out.println("****************************************** \n"); 
  }
 


public int save(ConfirmEmpFormBean p){  
    String sql="insert into confirmformemp(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
    return template.update(sql);  
}  
public int update(ConfirmEmpFormBean p){  
    String sql="update confirmformemp set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
    //return template.update(sql);
    int statusOfUpdate = template.update(sql);
    System.out.println("Emp Update Status = "+statusOfUpdate);	
    return statusOfUpdate; 
}  
public int delete(int id){  
    String sql="delete from confirmformemp where id="+id+"";  
    return template.update(sql);  
}  
public ConfirmEmpFormBean getEmpById(int id){  
    String sql="select * from confirmformemp where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<ConfirmEmpFormBean>(ConfirmEmpFormBean.class));  
}  
public List<ConfirmEmpFormBean> getEmployees(){  
    //return template.query("select * from confirmformemp",new RowMapper<ConfirmEmpFormBean>(){  
	 return template.query("select * from confirmformemp",new RowMapper<ConfirmEmpFormBean>(){
        public ConfirmEmpFormBean mapRow(ResultSet rs, int row) throws SQLException {  
        	ConfirmEmpFormBean e=new ConfirmEmpFormBean();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setSalary(rs.getFloat(3));  
            e.setDesignation(rs.getString(4));  
        //	System.out.println("ConfirmEmpFormBean:"+" getEmployees().= "+e);	
            return e;  
        }  
    });  
}  
}  
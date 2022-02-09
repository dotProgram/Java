package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.stockmanagement.beans.ClientRegistrationBean;
import com.stockmanagement.beans.Emp;  


public class ClientRegistrationDAO { 
	ClientRegistrationBean result3;
	List<ClientRegistrationBean> users;
	
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
    
}

public int save(ClientRegistrationBean p){  
    String sql="insert into clientRegistration(firstname,lastname,password,email) values('"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getPassword()+"','"+p.getEmailAddress()+"')";  
    return template.update(sql);  
} 

public int checkForEmailID(String email) {
	
String sql = "select firstname from clientregistration where email = '"+email+"'"; 
System.out.println(sql);
int result = 22;
//template.queryForObject(sql, new Object[]{email},new BeanPropertyRowMapper<ClientRegistrationBean>(ClientRegistrationBean.class));	

try {
 //users = (List<ClientRegistrationBean>) template.query(sql, new Object[]{email},new BeanPropertyRowMapper<ClientRegistrationBean>(ClientRegistrationBean.class));
 users = template.query(sql, new ClientMapper());
} catch (DataAccessException e) {
	
	e.printStackTrace();
}
System.out.println("ClientRegistrationBean \t"+users);
return 1;

}














 
public int update(Emp p){  
    String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
    //return template.update(sql);
    int statusOfUpdate = template.update(sql);
    System.out.println("Emp Update Status = "+statusOfUpdate);	
    return statusOfUpdate; 
}  
public int delete(int id){  
    String sql="delete from Emp99 where id="+id+"";  
    return template.update(sql);  
}  
public Emp getEmpById(int id){  
    String sql="select * from Emp99 where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
}  
public List<Emp> getEmployees(){  
    return template.query("select * from Emp99",new RowMapper<Emp>(){  
        public Emp mapRow(ResultSet rs, int row) throws SQLException {  
            Emp e=new Emp();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setSalary(rs.getFloat(3));  
            e.setDesignation(rs.getString(4));  
            return e;  
        }  
    });  
}  

public List<ClientRegistrationBean> getClient(String email){  
    return template.query("select * from clientregistration where email = '"+email+"'",new RowMapper<ClientRegistrationBean>(){  
        public ClientRegistrationBean mapRow(ResultSet rs, int row) throws SQLException {  
        	ClientRegistrationBean e=new ClientRegistrationBean();  
           // e.set
            e.setFirstName(rs.getString(2));  
            //e.setLastName(rs.getString(3));  
           // e.setEmailAddress(rs.getString(4));  
            return e;  
        }  
    });  
}  



public ClientRegistrationBean getClient3(String email){  
    return (ClientRegistrationBean) template.query("select * from clientregistration where email = '"+email+"'",new RowMapper<Object>(){  
        public ClientRegistrationBean mapRow(ResultSet rs, int row) throws SQLException {  
        	ClientRegistrationBean e = new ClientRegistrationBean();  
           // e.set
            e.setFirstName(rs.getString(2));  
            //e.setLastName(rs.getString(3));  
           // e.setEmailAddress(rs.getString(4));  
            return e;  
        }  
    });  
}

}


class ClientMapper implements RowMapper<ClientRegistrationBean> {

	  public ClientRegistrationBean mapRow(ResultSet rs, int arg1) throws SQLException {
		  ClientRegistrationBean clentInfo = new ClientRegistrationBean();

		  clentInfo.setEmailAddress(rs.getString("email"));
	    
	    
	    /*user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("firstname"));
	    user.setLastname(rs.getString("lastname"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setPhone(rs.getInt("phone"));*/

	    return clentInfo;
	  }}


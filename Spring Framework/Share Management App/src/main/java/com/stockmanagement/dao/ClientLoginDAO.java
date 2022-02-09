package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.stockmanagement.beans.ClientLoginBean;
import com.stockmanagement.beans.ClientRegistrationBean;
import com.stockmanagement.beans.Emp;  


public class ClientLoginDAO { 
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


public List<ClientLoginBean> getClient(String email){  
    return template.query("select * from clientregistration where email = '"+email+"'",new RowMapper<ClientLoginBean>(){  
        public ClientLoginBean mapRow(ResultSet rs, int row) throws SQLException {  
        	ClientLoginBean e=new ClientLoginBean();  
           // e.set
         // e.setFirstName(rs.getString(2));  
            //e.setLastName(rs.getString(3)); 
           e.setPassword(rs.getString(5));
           e.setEmailAddress(rs.getString(4));  
           e.setFirstName(rs.getString(2));  
            return e;
        }  
    });  
}  













 
}
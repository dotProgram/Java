package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate; 
import org.springframework.jdbc.core.RowMapper;

import com.stockmanagement.beans.User;

  
public class UserDao {  


public UserDao() {
		  System.out.println("****************************************** ");
		  System.out.println("******************** ");
		  System.out.println("********* ");
		  System.out.println("**** ");
		  System.out.println("Constructor of UserDao DAO invoked");
		 

		  System.out.println("**** ");
		  System.out.println("********* ");	  
		  System.out.println("******************** ");
		  System.out.println("****************************************** ");
	
	}
/**
 * 
public UserDao(String name) {
	System.out.println("SpringMVC-JDBC-2 DAO UserDao Constructor String value...:"+name);
	
	}
//@Autowired
public UserDao(int pocoUser) {
	System.out.println("SpringMVC-JDBC-2 DAO pocoDao Constructor Int value...:"+pocoUser);
	
	}
 */



JdbcTemplate template;  
  
public void settemplate(JdbcTemplate template) {  
    this.template = template;  
    System.out.println("setTemplate(JdbcTemplate template) {");
    System.out.println("setting value of template via *this.template* UserDao-DAO");
    System.out.println("****************************************** ");
}
// /*
public int save(User p){  
    String sql="insert into user(firstN,lName,userid,email,phno) values('"+p.getFirstN()+"',"+p.getlName()+"',"+p.getUserid()+"',"+p.getEmail()+"',"+p.getPhno()+")";  
    return template.update(sql);  
}  
public int update(User p){  
    String sql="update user set firstN='"+p.getFirstN()+"', lName='"+p.getlName()+"',userid='"+p.getUserid()+"',email='"+p.getEmail()+"', phno="+p.getPhno()+" where id="+p.getId(); 
    int statusOfUpdate = template.update(sql);
    System.out.println("Update SQL = "+sql);
    System.out.println("User Update Status = "+statusOfUpdate);	
    return statusOfUpdate;  
}  
//
public int delete(int id){  
	System.out.println("SpringMVC-JDBC-2 Inside User Delete: ");
    String sql="delete from user where id="+id+""; 
    int status = template.update(sql);
    System.out.println("SpringMVC-JDBC-2 status for delete id  "+id+"= "+status);
    return status;  
}  

public User getUserById(int id){  
    String sql="select * from user where id=?";  
    System.out.println("SpringMVC-JDBC-2 getUserById: "+id);
    
		    if(template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class)).getUserid() != null) {
		    System.out.println("SpringMVC-JDBC-2 Value +ent User Id: "+template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class)).getUserid());
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class));  
		}  
		    else{
		    	return template.queryForObject(null, null, new BeanPropertyRowMapper<User>(User.class));
		    }
}  

int loopNO=1;	
int baseP =1;
// Creating object of *beans.User.java* and putting the class elements in an Array List
public List<User> getUser(){ 
	 baseP++;
	System.out.println("SpringMVC-JDBC-2 Looping No List<User>: "+baseP);
    return template.query("select * from user",new RowMapper<User>(){  //Template Query Starts Here 
    	
    
    	public User mapRow(ResultSet rs, int row) throws SQLException {  
        	
        	System.out.println("SpringMVC-JDBC-2 Looping No: "+loopNO+",Row no INT= "+row+"  |   "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
        	User userBeanObject=new User();  
            userBeanObject.setId(rs.getInt(1)); 
            userBeanObject.setRole(rs.getString(2));
            userBeanObject.setFirstN(rs.getString(3));
            userBeanObject.setlName(rs.getString(4)); 
            userBeanObject.setUserid(rs.getString(5)); 
            userBeanObject.setEmail(rs.getString(7)); 
            userBeanObject.setPhno(rs.getInt(8)); 
            
            loopNO++;
            return userBeanObject;
            
        }  
    	//baseP++;
    });  //Template Query Ends Here
}
}


package com.stockmanagement.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.stockmanagement.beans.Emp;
import com.stockmanagement.beans.Notes;  
  
public class NotesDAO { 

JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  }

public int save(Emp p){  
    String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
    return template.update(sql);  
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
public List<Notes> getNotes(){  
    return template.query("select * from notes",new RowMapper<Notes>(){  
        public Notes mapRow(ResultSet rs, int row) throws SQLException {  
        	Notes e=new Notes();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setSubject(rs.getString(3));  
            e.setDescription(rs.getString(4));  
            return e;  
        }  
    });  
}  
}  
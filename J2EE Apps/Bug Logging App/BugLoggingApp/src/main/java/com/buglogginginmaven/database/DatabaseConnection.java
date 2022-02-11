/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buglogginginmaven.database;

public class DatabaseConnection {
public void DatabaseConnection(){
    System.out.println("*************************************");
    System.out.println("DatabaseConnection Object Invoked");
    System.out.println("**************************************");
}

 //Remote Server Database   
  /*    
public static String databaseconnection_driver = "com.mysql.cj.jdbc.Driver"; 
public static String databaseconnection_url = "jdbc:mysql://bj9fr60lhi3jqcexrp4o-mysql.services.clever-cloud.com/"; 
public static String databaseconnection_url_db = "jdbc:mysql://bj9fr60lhi3jqcexrp4o-mysql.services.clever-cloud.com:3306/bj9fr60lhi3jqcexrp4o"; 
public static String databaseconnection_database = "bj9fr60lhi3jqcexrp4o"; 
public static String databaseconnection_username = "uozzffulm51oaapy"; 
public static String databaseconnection_password = "uhgtC5fENZkj2THastVo"; 
     */     
  
  /*    
 //Remote Server Database   

public static String databaseconnection_driver = "com.mysql.cj.jdbc.Driver"; 
public static String databaseconnection_url = "jdbc:mysql://remotemysql.com/"; 
public static String databaseconnection_url_db = "jdbc:mysql://remotemysql.com:3306/28zxOcV0ik"; 
public static String databaseconnection_database = "28zxOcV0ik"; 
public static String databaseconnection_username = "28zxOcV0ik"; 
public static String databaseconnection_password = "LJkWomyi2C"; 
  */ 

  /*  
//Local Server Database        */
public static String databaseconnection_driver = "com.mysql.cj.jdbc.Driver"; 
public static String databaseconnection_url = "jdbc:mysql://localhost:3306/"; 
public static String databaseconnection_url_db = "jdbc:mysql://localhost:3306/servlet"; 
public static String databaseconnection_database = "servlet"; 
public static String databaseconnection_username = "root"; 
public static String databaseconnection_password = ""; 




//public static String databaseconnection_string = databaseconnection_url+databaseconnection_database+", "+databaseconnection_username+","+databaseconnection_password; 
public static String databaseconnection_string = databaseconnection_url+databaseconnection_database+","+databaseconnection_username+","; 
//public static String databaseconnection_connection = db_url+"/"+db_name+"/"+"/"+db_username+"/"+db_password; 
}

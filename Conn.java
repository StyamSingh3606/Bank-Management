package Bank_Management;

import java.sql.*;  

public class Conn{
    Connection c1;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c1 =DriverManager.getConnection("jdbc:mysql:///BankManagementSystem","root","S@tyam132001");    
            s =c1.createStatement(); 
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

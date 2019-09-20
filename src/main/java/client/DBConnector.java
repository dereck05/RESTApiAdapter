/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author derec
 */
public class DBConnector {
    
    public DBConnector(){
        
    }
   
    public String consultar(String name){
        String res = "\nDatabase Result\n\n";
        try{ 
            
            Class.forName("com.mysql.jdbc.Driver");  

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restjava","dereck0512","Hola1234");  

            Statement stmt=conn.createStatement();  

            ResultSet rs=stmt.executeQuery("select * from restjava.empleado having nombre = '"+name + "'");  

            while(rs.next()){
                res+="\nNombre:"+ rs.getString("nombre")+"\n";
                res+="Cedula:"+ rs.getString("cedula")+"\n";
                res+="Puesto:"+ rs.getString("puesto")+"\n";
            }  
                
            conn.close();
            rs.close();
            stmt.close();
            

        }catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
}

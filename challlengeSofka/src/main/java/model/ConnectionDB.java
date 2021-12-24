/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
/**
 *
 * @author FELIPE RIVAS
 */
public class ConnectionDB {
    private String url="jdbc:mysql://localhost/challengesofka";
    private String user="root";
    private String password="1234";
    private Connection con=null;
    
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");          
            con=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("no fue posible cargar el driver"+ex);
        }catch (SQLException e){
             System.out.println("error aceder base de datos"+e);
         
        }
        return con;
    }
}


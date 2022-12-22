package com.pgy.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private Connection conexion;
    
    public DBContext(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/root";
            String user = "ADMIN";
            String pass = "tg-m2Ej7";
            conexion= DriverManager.getConnection(url, user, pass);
            System.out.println("se ha establecido conexión");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return conexion;
    }
    
}

package com.pgy.dataaccess;

import com.pgy.business.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDA {
    
    public ResultSet get(int codigo){
      DBContext dbCtx = new DBContext(); 
      String st = "select codigo, nombre, precio, stock from producto where codigo = ?";
      ResultSet rs;
      try{
          PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
          pst.setInt(1, codigo);
          rs=pst.executeQuery();
          return rs;
      }
      catch(SQLException e){
          System.out.println("error: " + e.getMessage());
          return null;
      }        
    }
    
     
}

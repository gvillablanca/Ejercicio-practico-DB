
package com.pgy.business;

import com.pgy.dataaccess.ProductoDA;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private int stock;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public Producto obtener(int codigo){
        ResultSet rs = new ProductoDA().get(codigo);
        if(rs != null){
            try{
                if(rs.next()){
                    this.codigo = rs.getInt("codigo");
                    this.nombre = rs.getString("nombre");
                    this.precio = rs.getInt("precio");
                    this.stock  = rs.getInt("stock");
                    return this;
                }
                else{
                    System.out.println("fallo ....");
                    return null;
                }
            } catch (SQLException ex) {
                System.out.println("fallo ....:  " + ex);
                return null;
            }            
        }
        else{
            return null;
        }        
    }  
}

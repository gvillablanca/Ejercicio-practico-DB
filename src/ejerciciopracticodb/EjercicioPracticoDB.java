package ejerciciopracticodb;

import com.pgy.business.Producto;
import java.util.Scanner;

public class EjercicioPracticoDB { 
    public static void main(String[] args) {
        String codigoStr = new String();
        
        System.out.println("Ingresa codigo: ");
        Scanner codigoIn = new Scanner(System.in);
        codigoStr = codigoIn.nextLine();
        
        int codigo =  Integer.parseInt(codigoStr);
        
        Producto producto = new Producto();
        producto.obtener(codigo);
        
        if(producto != null){
            System.out.println(producto);
        }
        else{
            System.out.println("no existe esa wea que pregunta");
        }
       
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio2Main {
     public static void main(String[] args) {
        Ejercicio2Procesos objeto = new Ejercicio2Procesos();
     Scanner leer = new Scanner(System.in);
      NumberFormat formato = new DecimalFormat("###.##");
        System.out.println("Ingrese la cantidad que genero en Ventas");
        objeto.setMontoVendido(Double.parseDouble(leer.nextLine()));
        
        String cantidad = objeto.calcComision(objeto);
        Double salarioBr = objeto.calcSalarioBr(objeto);
        
        //System.out.println("" + cantidad);
        System.out.println("Comision por venta: $" + objeto.getComisionporVenta());
        System.out.println("Salario bruto: $" + salarioBr);
        
        
        
     
    
    
    
    }
}

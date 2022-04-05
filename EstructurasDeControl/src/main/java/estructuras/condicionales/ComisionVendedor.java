/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author manuelpiano31
 */
public class ComisionVendedor {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el valor de la venta:");
            double valorVenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el genero del vendedor:");
            String genero = leer.readLine();
            calcularComision(valorVenta, genero.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void calcularComision(double valorVenta, char generoVendedor) {
        double comision, salario = 0.0;
        String genero = "";
        if(generoVendedor == 'M'){
            genero = "MASCULINO";
            comision = valorVenta * 0.03;
            salario = comision + 200;
        }else if(generoVendedor == 'F'){
            genero = "FEMENINO";
            comision = valorVenta * 0.05;
            salario = comision +200;
        }
        System.out.println("El Salario del vendedor es: " + genero + " es de :" + salario);

    }
    }

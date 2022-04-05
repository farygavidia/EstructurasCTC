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
public class EstructuraSwitchInt {
    public static void main(String[] args) {
        try{
            
        
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar un numero entre 1 y 5: ");
            int numero = Integer.parseInt(leer.readLine());
            switchInt(numero);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void switchInt(int numero) {
        String nombreDelNumero;
        nombreDelNumero = switch (numero) {
            case 1 -> "UNO";
            case 2 -> "DOS";
            case 3 -> "TRES";
            case 4 -> "CUATRO";
            case 5 -> "CINCO";
            default -> "NUMERO NO VALIDO";
        };
        System.out.println("El numero ingresado es: " + nombreDelNumero);
    }
}

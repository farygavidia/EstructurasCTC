/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EstructuraIfElse {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario: ");
            double salario = Double.parseDouble(leer.readLine());
            ifElse(salario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void ifElse(double salario) {
        if(salario>235){
            System.out.println("usted gana mas del salario minimo");
        }else{
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}

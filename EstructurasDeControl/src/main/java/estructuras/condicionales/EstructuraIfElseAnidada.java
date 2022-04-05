/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.condicionales;

/**
 *
 * @author manuelpiano31
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EstructuraIfElseAnidada {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            double salario = Double.parseDouble(leer.readLine());
            ifElseAnidada(salario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void ifElseAnidada(double salario) {
        if(salario > 235){
            System.out.println("Usted gana mas del salario :");
        }else if(salario>0){
            System.out.println("usted gana menos del salario minimo");
        }else{
            System.out.println("Ingreso de dato erroneo!");
        }
    }
}

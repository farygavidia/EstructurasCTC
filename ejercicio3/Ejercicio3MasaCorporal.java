/*
 3-. Crear un programa que calcule el índice de masa corporal de una persona según la siguiente formula e indique el
estado en el que se encuentra esa persona en función del valor de IMC.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3MasaCorporal {
    public static void main(String[] args) {
        double indiceMC;
        double peso_kg = 0;
        double estatura_Mts = 0;
        
        Scanner leer = new Scanner(System.in);
        try{
        System.out.println("Introdusca su peso en kg. : ");
        peso_kg = leer.nextDouble();
        System.out.println("Introdusca su estatura en metros cuadrados :");
        estatura_Mts = leer.nextDouble();
        }catch(NumberFormatException ex1){
            System.out.println(ex1.getMessage());
        }catch(Exception ex2){
            System.out.println("Error. Solo se permiten numeros");
        }
        indiceMC = peso_kg/(estatura_Mts*estatura_Mts);
        
        if(indiceMC < 18){
            System.out.println("Peso bajo. Nesesita valorar signos de desnutricion");
        }else if(indiceMC >= 18 && indiceMC <=24.9){
            System.out.println("Normal");
        }else if(indiceMC >= 25 && indiceMC <=26.9){
            System.out.println("Sobrepeso");
        }else if(indiceMC > 27){
            System.out.println("Obesidad");
        }else if(indiceMC >= 27 && indiceMC <= 29.9){
            System.out.println("Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares.");
        }else if(indiceMC >= 30 && indiceMC <= 39.9){
            System.out.println("Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares.");
        }else if(indiceMC > 40){
            System.out.println("Obesidad grado III Extrema ó Mórbida. Riesgo relativo extremadamente alto para el desarrollo"
                    + "de enfermedades cardiovasculares.");
        }
    }
}

package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraIfSencillo {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario");
            double salario = Double.parseDouble(leer.readLine());
            ifSencillo(salario);
            
       }catch(Exception e){
            System.out.println(e.getMessage());
       }
    }

    private static void ifSencillo(double salario) {
        if(salario > 235){
            System.out.println("Usted gana mas del salario minimo");
        }
    }
    
}

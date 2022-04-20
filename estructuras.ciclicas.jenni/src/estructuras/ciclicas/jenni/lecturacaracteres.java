/*4-. Nos piden desarrollar un programa para poder extraer cada uno de los caracteres de una variable String conteniendo un 
nombre. Por ejemplo si ingresamos el nombre LETICIA el programa tiene que imprimir lo siguiente:
Carácter 1 ->: L
Carácter 2 ->: E
Carácter 3 ->: T
Carácter 4 ->: I
Carácter 5 ->: C
Carácter 6 ->: I
Carácter 7 ->: A
La clase se llamara LecturaCaracteres; el código será el siguiente:*/
package estructuras.ciclicas.jenni;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lecturacaracteres {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
         System.out.println("ingresar el nombre");
         String nombre = leer.readLine();
         //pasar todo a mayuscula
         leerCaracteresFor(nombre.toUpperCase());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void leerCaracteresFor(String palabra){
        //for(valor inicial; valor final; incremento)
        for(int i=0; i<palabra.length(); i++){//parametro final la cantidad de caracteres
        //palabra.charAt(1)imprime el caracter corespondiente a la posicion i
            System.out.println("caracter: " + i + "-> : " + palabra.charAt(i));
            
        }
    } 
}

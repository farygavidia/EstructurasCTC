
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraDoWhile {
    public static void main(String[] args) {

try{

BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));

System.out.println("Ingresar un número limite de repetición:"); 
String limite= leer.readLine();

//Casting conversión de datos al momento de envia

instruccionDoWhile (Integer.parseInt(limite));

}catch (Exception e) {

System.out.println (e.getMessage());
}
    }
public static void instruccionDoWhile(int valorLimite){
 int i = 1;
//Valor inicial del contador

do{ //Realiza por lo menos una vez in acción

System.out.println("El valor de la repetición es" +i);

 i++;//Incremento del contador
}while( i <= valorLimite); //Evalus Is condición antes de volde a repetir
}
}


package estructuras.ciclicas;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class EstructuraFor {

public static void main(String[] args) {

try{

BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
System.out.println("Ingresar un número limite de repetición:"); 
//Cesting o conversión de datos al momento de envio

String limite= leer.readLine();


instruccionFor (Integer.parseInt(limite)); 
}catch (Exception e) {

System.out.println (e.getMessage());
}
}
public static void instruccionFor(int valorLimite) { 
//for(valor inicial: valor final; incremento)
 
for (int i = 1; i <= valorLimite; i++) { 
    System.out.println("El valor de la repetición es: " + 1);

}
}
}

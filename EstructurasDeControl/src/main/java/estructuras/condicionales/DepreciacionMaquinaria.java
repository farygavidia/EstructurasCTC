
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author manuelpiano31
 */
public class DepreciacionMaquinaria {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresa la informacion solicitada a continuacion: ");
            System.out.println("Ingrese el costo de la maquinaria:");
            double costo = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el periodo de tiempo en anhios de depreciacion");
            int anhios = Integer.parseInt(leer.readLine());
            System.out.println("la cantidad: ");
            double cantidad = Double.parseDouble(leer.readLine());
            
            calculoDepreciacion(cantidad, costo, anhios);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void calculoDepreciacion(double costo, double cantidad, int anhios) {
        for(int i= 1 ; i<= anhios; i++){
            double sumaDigitos = cantidad * anhios;
            cantidad += (anhios/sumaDigitos)*costo;
            System.out.println("La depreciacion Es de : " + cantidad);
        }
    }
}

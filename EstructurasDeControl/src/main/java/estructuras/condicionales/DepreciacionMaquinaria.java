
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
            System.out.println("Ingrese el nombre de la maquinaria: ");
            String nombre = leer.readLine();
            System.out.println("Ingrese el costo de la maquinaria:");
            double costo = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el periodo de tiempo en anhios de depreciacion");
            int anhios = Integer.parseInt(leer.readLine());
            calculoDepreciacion(vidaUtil, sumaDigitos, valorActivo);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

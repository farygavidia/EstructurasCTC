/*Nos piden hacer un programa que determine el capital a obtener por un ahorrante después de determinados años. 
El programa deberá permitir ingresar el capital inicial, la tasa de interés que rendirá nuestro capital en cada año así como el 
número de años que tendremos el dinero depositado en el banco.
Formula del cálculo del interés simple: Interés = Capital x Tasa de Interés x Tiempo
Módulo: Metodologías ágiles para el desarrollo de software -- Facilitador: Manuel de Jesús Gámez López.
10
Debemos de calcular el interés devengado por nuestro dinero ahorrado al finalizar cada año. Los intereses devengados 
son adicionados al capital que tenemos ahorrados.
Ejemplo: Si depositamos $100 a 5 años a una tasa de interés del 4%, el primer año ganaremos $4, el segundo año 
ganaremos $4.16, el tercero $4.32 y así sucesivamente. Suponiendo que el dinero lo retiramos al termino de los 5 años, el 
banco nos devolverá $116.98 */
package estructuras.ciclicas.jenni;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calcularinteressimple {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
         System.out.println("INGRESE LA SIGUIENTE INFORMACION");
         System.out.println("cabtdad de dinero depocitadad");
         double cantidad = Double.parseDouble(leer.readLine());
            System.out.println("cantidad de años del depocito;");
            double interes = Double.parseDouble(leer.readLine());
            System.out.println("----------------------------");
            interesSimple(cantidad, años, interes);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void interesSimple(double cantidad, int años, double interes){
        for (int i = 1; i<= años; i++){
            double interesPorAños= cantidad * (interes / 100); //calculo del interes anual
            cantidad += cantidad * (interes / 100); //suma la cantidad actua mas el interes de esa cantidad 
            System.out.println("cantidad intereses en el año" + i + ": " + interesPorAños);
            System.out.println("monto interes mas dinero" + cantidad);
            System.out.println("-----------------------------------");
        }
        
    }
    
}

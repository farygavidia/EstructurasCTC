/* 2-. La  empresa  Compu Smart  se  dedica  a  la  venta  de  equipos  de  computación.  Vende tanto computadoras como 
dispositivos periféricos y  consumibles. La empresa cuenta con un grupo de 5 vendedores a los cuales les paga la comisión 
según el rango de la venta efectuada. Si el vendedor vende de $3000 en adelante la comisión es el 10%, si vende  de $1000
a $2999 gana el 8% y si la venta es de  1$ a $999 gana un 5%. Pero cada vendedor tiene un salario base de $300  al cual se
le suma el valor de la comisión por ventas.  Determinar el salario  líquido  de un vendedor según el monto de la venta 
realizadatomando en cuenta que se descuenta el 10% en concepto de renta.*/
package Ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio2Main {
    public static void main(String[] args) {
        Ejercicio2Procesos objeto = new Ejercicio2Procesos();
     Scanner leer = new Scanner(System.in);
      NumberFormat formato = new DecimalFormat("###.##");
        System.out.println("Ingrese la cantidad que genero en Ventas");
        objeto.setMontoVendido(Double.parseDouble(leer.nextLine()));
        
        Double cantComision = objeto.comision(objeto);
        String comision = objeto.calcComision(objeto);
        Double salarioBr = objeto.calcSalarioBr(objeto);
        Double renta = objeto.calcRenta(objeto);
        Double salarioLiq = objeto.calcSalarioLiq(objeto);
        
        System.out.println("\n" + comision);
        System.out.println("Comision por venta: $" + objeto.comisionporVenta);
        System.out.println("Salario bruto: $" + salarioBr);
        System.out.println("Concepto de renta: $" + renta);
        System.out.println("Salario Liquido: $" + salarioLiq);
    }
}

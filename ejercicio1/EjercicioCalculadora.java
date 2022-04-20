
 /*
1-. El ejercicio de la calculadora de la guía 2 modificarlo de tal manera que el usuario permita seleccionar que operación realizar 
S = Suma; R = Resta; M = Multiplicación y D = División, tomando en cuenta que no se puede dividir entre 0
 */
package ejercicio1;
import java.util.Scanner;

public class EjercicioCalculadora {

    public static void main(String[] args) {
        int calc = 0;
;
        double suma = 0;
        double resta = 0;
        double multiplicasion = 0;
        double division = 0;
   
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        try{
        System.out.println("Introdusca 1 para suma, 2 para resta, 3 para multiplicacion, 4 para divicion");
        calc = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Error solo digite numeros");
        }
        switch (calc) {
            case 1:
                suma = calculadora.suma();
                try {
                    System.out.println("Introusca el primer numero:");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("Introdusca el segundo numero:");
                    calculadora.setB(scanner.nextDouble());
                } catch (NumberFormatException ex1) {
                    System.out.println("No es un numero");
                } catch (Exception ex2) {
                    System.out.println("Error. Solo se aceptan numeros");
                }
                suma = calculadora.suma();
                System.out.println("------------------------------");
                System.out.println("El resusltado es :" + suma);

                break;
            case 2:
                resta = calculadora.resta();
                try {
                    System.out.println("Introusca el primer numero:");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("Introdusca el segundo numero:");
                    calculadora.setB(scanner.nextDouble());
                } catch (NumberFormatException ex1) {
                    System.out.println("Erro al digitar");
                } catch (Exception ex2) {
                    System.out.println("Error. Solo se aceptan numeros");
                }
                resta = calculadora.resta();
                System.out.println("*****************************");
                System.out.println("El resultado es :" + resta);
                break;
            case 3:
                try {
                    multiplicasion = calculadora.multiplicacion();
                    System.out.println("Introduzca el primer numero: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("Introduzca el segundo numero: ");
                    calculadora.setB(scanner.nextDouble());
                } catch (NumberFormatException ex1) {
                    System.out.println("Error al digitar");
                } catch (Exception ex2) {
                    System.out.println("Error. Solo se aceptan numeros");
                }
                multiplicasion = calculadora.multiplicasion();
                System.out.println("********************************");
                System.out.println("El resultado es : " + multiplicasion);
            break;
            case 4:
                try{
                division = calculadora.divicion();
                    System.out.println("Introduzca el primer numero: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("Introduzca el segundo numero: ");
                    calculadora.setB(scanner.nextDouble());
                }catch(NumberFormatException ex1){
                    System.out.println("Error al digitar");
                }catch(Exception ex2){
                    System.out.println("Error. Solo se aceptan numeros");
                }
                division = calculadora.divicion();
                System.out.println("******************************");
                System.out.println("El resultado es : " + division);
                break;

        }
    }
}
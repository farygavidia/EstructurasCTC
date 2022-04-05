
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    public static void main(String[] args) {
        try{
            
        
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese el estado civil de la persona: ");
            String estadoCivil =leer.readLine();
            switchchar(estadoCivil.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void switchchar(char estadoCivil) {
        String mensajeEstadoCivil;
        mensajeEstadoCivil = switch (estadoCivil) {
            case 'S' -> "Soltero/a";
            case 'C' -> "Casado/a";
            case 'D' -> "Divorciado/a";
            case 'A' -> "Acompañado/a";
            case 'F' -> "Forever Alone";
            default -> "Estado Civil Erroneo";
        };
        System.out.println("Su estado Civil es: " + mensajeEstadoCivil);
    }
    
}

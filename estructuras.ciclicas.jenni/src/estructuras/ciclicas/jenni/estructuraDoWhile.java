
package estructuras.ciclicas.jenni;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class estructuraDoWhile {   
    public static void main(String[] args) {
     try{
         
         BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
         System.out.println("ingresar un numero limite de reeticion");
         String limete = leer.readLine();
         //casting o convercion de datos al momento de envio
         instruccionDoWhile(Integer.parceInt(limite));
     }catch(Exception e){
         System.out.println(e.getMessage());
         
     
     }
    }

    private static void instruccionDoWhile ( int ValorLimite) {
        int i=1; //valor inicial del contador
        
        do{//realiza por lo menos una vez la accion
            System.out.println("el valor de la repeticion es:" + 1);
            i++;//incremento del contador
        }while(1<= ValorLimite);//evalua la condicion antes de volver a repetir

       {
        }
    }
    
}

    
}

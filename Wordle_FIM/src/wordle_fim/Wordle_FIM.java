package wordle_fim;

import java.util.*;

/**
 *
 * @author Ricardo Ferrel
 */
public class Wordle_FIM {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 6;
        boolean victoria = false;
        Juego wrdl = new Juego();
        
        System.out.println("                       WORDLE");
        System.out.println("Trata de encontrar la palabra correcta en 6 intentos!");
        System.out.println("       El largo de la palabra es de 6 letras.\n\n");
        System.out.println("Empezamos...");
        
        while(intentos != 0 && !victoria){
            System.out.println("Respuesta: ");
            String entrada = scanner.nextLine();
            if (entrada.length() > wrdl.getCorrecta().length() || entrada.length() < wrdl.getCorrecta().length() ) {
             System.out.println("Esa palabra no es de 6 letras, vuelve a intentarlo.");
             continue;
             }

            
            wrdl.entrada(entrada);
            if(entrada.equals(wrdl.getCorrecta().toLowerCase())){
                victoria = true;
                System.out.println("Has ganado!");
            } 
            else {
                intentos=intentos-1;
                System.out.println("Tienes " + intentos + " oportunidades restantes."); 
            }
        }
        
        if(!victoria) {
            System.out.println("Lo siento, has perdido. La palabra secreta era: " + wrdl.getCorrecta());
        }
    }
    
}
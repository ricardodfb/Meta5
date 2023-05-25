package wordle_fim;

import java.util.*;

/**
 *
 * @author Ricardo Ferrel
 */
public class Juego {
    private ArrayList<String> palabras;
    private Random rnd = new Random();
    private String correcta;
    private String entrada;

    public Juego(){
        palabras = new ArrayList<>();
        palabras.add("amigos");
        palabras.add("empleo");
        palabras.add("ignora");
        palabras.add("objeto");
        palabras.add("unirse");
        palabras.add("buenos");
        palabras.add("dormir");
        palabras.add("gritar");
        palabras.add("luchar");
        palabras.add("puntos");
        palabras.add("rutina");
        palabras.add("social");
        palabras.add("teclas");
        palabras.add("ganado");
        palabras.add("fiesta");
        correcta = palabras.get(rnd.nextInt(palabras.size()));
    }

    public String getCorrecta(){
        return correcta;
    }

    public void entrada(String entrada){
        this.entrada = entrada.toLowerCase();
        char[] arr1 = this.entrada.toCharArray();
        char[] arr2 = correcta.toCharArray();
        boolean[] encontrados = new boolean[arr2.length];
        for(int i = 0; i < arr1.length; i++){
            boolean encontrado = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j] && i == j && !encontrados[j]){ 
                    System.out.println(arr1[i] + " esta en la posicion correcta.");
                    encontrado = true;
                    encontrados[j] = true; 
                    break;
                }
                else if (arr1[i] == arr2[j] && !encontrados[j]){ 
                    System.out.println(arr1[i] + " pertenece a la palabra pero no esta en la posicion correcta.");
                    encontrado = true;
                    encontrados[j] = true; 
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(arr1[i] + " NO PERTENECE A LA PALABRA");
            }
        }
        System.out.println("\n");
    }    
}
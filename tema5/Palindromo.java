package tema5;
import java.util.Scanner;
//Ejercicio 5
public class Palindromo {

    public void palindromo(Scanner teclado){
        int inicio = 0;
        boolean error = false;
        System.out.println("Escriba una palabra: ");
        String palabra = teclado.next();
        int fin = palabra.length()-1;

        while ((inicio<fin) && (!error)){
			
            if (palabra.charAt(inicio)==palabra.charAt(fin)){				
                inicio++;
                fin--;
            } else {
                error = true;
            }
        }

        if(!error){
            System.out.println(palabra+" es un palindromo");
        }else{
            System.out.println(palabra+" no es palindromo");
        }

    }
}
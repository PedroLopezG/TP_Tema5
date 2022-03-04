package tema5;
import java.util.ArrayList;
import java.util.Scanner;

public class NotaMediaV4 {
    //Ejercicio3
    public void notaMedia(Scanner teclado){
        ArrayList<Double> notas = new ArrayList<>();
        double nota;
        double sum = 0;
        double media;
        
        do{
            System.out.println("¿Nota?: ");
            nota = teclado.nextDouble();
            if(nota != -1){
                notas.add(nota);
                sum+=nota;
            }
        }while(nota != -1);
        media = sum/notas.size();
        Object[] array = notas.toArray();
        System.out.println("La media de las notas: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(String.format("es: %.2f", media));

        

    }
}

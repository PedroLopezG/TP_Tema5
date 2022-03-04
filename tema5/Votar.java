package tema5;

import java.util.Scanner;

public class Votar {
    //Ejercicio4
    public void democracia(Scanner teclado){
        int emilia=0;
        int gerardo=0;
        int maria=0;
        int nadia=0;
        int[] urnas = new int[1];
        int voto = 0;
        int x=0;
        while (voto!=68753421) {
            System.out.println("Elija entre:");
            System.out.println("1 - Emilia TERREROS");
            System.out.println("2 - Gerardo ESCODAR");
            System.out.println("3 - María AGUAVIVA");
            System.out.println("4 - Nadia LETUX");
            voto=teclado.nextInt();
            urnas[x]=voto;
            int[] aux;
            aux = new int[urnas.length+1];
            for (int i=0;i<urnas.length;i++){
                aux[i]=urnas[i];
            }
            urnas = new int[urnas.length+1];

            for (int i=0;i<urnas.length;i++){
                urnas[i]=aux[i];
            }
            x++;
            if (voto!=68753421) {
                System.out.println("Ha votado");
            }
        }
        for(int i=0;i<urnas.length;i++){
            if (urnas[i]==1){
                emilia++;
            }else if (urnas[i]==2){
                gerardo++;
            }else if (urnas[i]==3){
                maria++;
            }else if (urnas[i]==4){
                nadia++;
            }
        }
        System.out.println("Resultados:");
        System.out.println(String.format("Emilia TERREROS: %.2f %%",((float)emilia*100/((float)emilia+gerardo+maria+nadia))));
        System.out.println(String.format("Gerardo ESCODAR: %.2f %%",((float)gerardo*100/((float)emilia+gerardo+maria+nadia))));
        System.out.println(String.format("María AGUAVIVA: %.2f %%",((float)maria*100/((float)emilia+gerardo+maria+nadia))));
        System.out.println(String.format("Nadia LETUX: %.2f %%",((float)nadia*100/((float)emilia+gerardo+maria+nadia))));
    }
}


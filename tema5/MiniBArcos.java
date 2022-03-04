package tema5;

import java.util.Scanner;

public class MiniBArcos {
    //Ejercicio 8
    public void undirLaMiniFlota(Scanner teclado){
    final int T = 4;
    boolean jugando = true;
    String[][] interfaz = new String[T][T];
    int[][] tablero =  new int[T][T];
        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                tablero[j][i]=0;
        }
    }
        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                interfaz[j][i]="?";
            }
        }
    int f = (int) ((Math.random() * (3 - 0)) + 0);
    int c = (int) ((Math.random() * (3 - 0)) + 0);
    tablero[f][c]= 1;
    while (jugando){
        imprimir(interfaz);
        System.out.println("Que columna? ");
        int rc = teclado.nextInt();
        System.out.println("¿Que fila?");
        int rf = teclado.nextInt();

        if (tablero[rf][rc]==1){
            jugando = false;
        }else {
            System.out.println("Agua");
            interfaz[rf][rc]="~";
        }

        }
        System.out.println("Tocado y hundido");
        System.out.println("Has ganado!");
    }



    public void imprimir(String[][] tab2d){
        for (int j=0;j<tab2d.length;j++){
            for (int i=0;i< tab2d.length;i++){
                System.out.print(" "+tab2d[j][i]);
            }
            System.out.println("");
        }


    }

}

package tema5;

import java.util.Scanner;

public class TresEnRaya {
    char tablero[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    public void tresEnRaya(Scanner teclado){
        int posicion, posicion2;
        
        do{
            imprimirTablero();
            System.out.println("Jugador 1 (X): Elige una posición");
            posicion = teclado.nextInt();
            rellenarTablero(posicion, 'X');
            imprimirTablero();
            if(ganadorJ1()){
                break;
            }
            System.out.println("Jugador 2 (O): Elige una posición");
            posicion2 = teclado.nextInt();
            rellenarTablero(posicion2, 'O');
            if(ganadorJ2()){
                imprimirTablero();
            }
        }while(ganadorJ1() == false && ganadorJ2() == false);

        if(ganadorJ1()){
            System.out.println("Ha ganado el jugador 1 (X)");
        }else{
            System.out.println("Ha ganado el jugador 2 (O)");
        }
    }

    private boolean ganadorJ1(){
        if(tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] == 'X'){
            return true;
        }
        if(tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[0][0] == 'X'){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean ganadorJ2(){
        if(tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] == 'O'){
            return true;
        }
        if(tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[0][0] == 'O'){
            return true;
        }
        else{
            return false;
        }
    }

    private void imprimirTablero(){
        for (int x=0; x < tablero.length; x++) {
            System.out.print("|");
            for (int y=0; y < tablero[x].length; y++) {
              System.out.print (tablero[x][y]);
              if (y!=tablero[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    private void rellenarTablero(int pos, char ficha){
        if(pos == 1){
            tablero[0][0] = ficha;
        }
        if(pos == 2){
            tablero[0][1] = ficha;
        }
        if(pos == 3){
            tablero[0][2] = ficha;
        }
        if(pos == 4){
            tablero[1][0] = ficha;
        }
        if(pos == 5){
            tablero[1][1] = ficha;
        }
        if(pos == 6){
            tablero[1][2] = ficha;
        }
        if(pos == 7){
            tablero[2][0] = ficha;
        }
        if(pos == 8){
            tablero[2][1] = ficha;
        }
        if(pos == 9){
            tablero[2][2] = ficha;
        }
    }
}

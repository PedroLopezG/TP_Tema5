package tema5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){



        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion != 11) {
            menu();
            eleccion = teclado.nextInt();

            switch (eleccion) {

                case 1:
                    DespegueInmediato ejercicio1 =  new DespegueInmediato();
                    ejercicio1.despegue();
                    break;
                case 2:
                    NumeroOcurrencias ejercicio2 = new NumeroOcurrencias();
                    ejercicio2.ocurrencias(teclado);
                    break;
                case 3:
                    NotaMediaV4 ejercicio3 = new NotaMediaV4();
                    ejercicio3.notaMedia(teclado);
                    break;
                case 4:
                    Votar ejercicio4 = new Votar();
                    ejercicio4.democracia(teclado);
                    break;
                case 5:
                    Palindromo ejercicio5 = new Palindromo();
                    ejercicio5.palindromo(teclado);
                    break;
                case 6:
                    QueHace ejercicio6 = new QueHace();
                    ejercicio6.tabla();
                    break;
                case 7:
                    Matriz ejercicio7 = new Matriz();
                    ejercicio7.matriz();
                    break;
                case 8:
                    MiniBArcos ejercicio8 = new MiniBArcos();
                    ejercicio8.undirLaMiniFlota(teclado);
                    break;
                case 9:
                    TresEnRaya ejercicio9 = new TresEnRaya();
                    ejercicio9.tresEnRaya(teclado);
                    break;
                default:
                    System.out.println("\nOpcion no valida\n");
                    break;

            }
        }
        System.out.println("Saliendo . . .");
    }


    private static void menu(){
        System.out.println("\nQue ejercicio quieres ver: \n" );
        System.out.println("1. Despegue inmediato");
        System.out.println("2. Número de ocurrencias");
        System.out.println("3. Nota media (versión 4)");
        System.out.println("4. Máquina de votar");
        System.out.println("5. Palíndromo");
        System.out.println("6. ¿Qué hace?");
        System.out.println("7. Matriz");
        System.out.println("8. Micro guerra de barcos");
        System.out.println("9. Tres en raya");
        System.out.println("10. Registro de Empleados");
        System.out.println("11. Salir\n");
    }





}

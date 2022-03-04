package tema5;

import java.util.Scanner;

public class NumeroOcurrencias {
    //Ejercicio2
    public void ocurrencias(Scanner teclado){
        int cero=0;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int seis=0;
        int siete=0;
        int ocho=0;
        int nueve=0;
        int[] ocurrencias = new int[1];
        int num = 0;
        System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
        num=teclado.nextInt();
        if (num==0){
            cero++;
        }else if (num==1){
            uno++;
        }else if (num==2){
            dos++;
        }else if (num==3){
            tres++;
        }else if (num==4){
            cuatro++;
        }else if (num==5){
            cinco++;
        }else if (num==6){
            seis++;
        }else if (num==7){
            siete++;
        }else if (num==8){
            ocho++;
        }else if (num==9){
            nueve++;
        }

        int x=0;
        while (num!=-1){

            System.out.println("Otro valor, por favor o -1 para terminar...");
            num=teclado.nextInt();
            ocurrencias[x]= num;
            int[] aux;
            aux = new int[ocurrencias.length+1];
            for (int i=0;i<ocurrencias.length;i++){
                aux[i]=ocurrencias[i];
            }
            ocurrencias = new int[ocurrencias.length+1];

            for (int i=0;i<ocurrencias.length;i++){
                ocurrencias[i]=aux[i];
            }
            x++;
            }

        for(int i=0;i<ocurrencias.length;i++){
            if (ocurrencias[i]==0){
                cero++;
            }else if (ocurrencias[i]==1){
                uno++;
            }else if (ocurrencias[i]==2){
                dos++;
            }else if (ocurrencias[i]==3){
                tres++;
            }else if (ocurrencias[i]==4){
                cuatro++;
            }else if (ocurrencias[i]==5){
                cinco++;
            }else if (ocurrencias[i]==6){
                seis++;
            }else if (ocurrencias[i]==7){
                siete++;
            }else if (ocurrencias[i]==8){
                ocho++;
            }else if (ocurrencias[i]==9){
                nueve++;
            }
        }
        cero--;
        System.out.println(String.format("Cantidad de 0: %d",cero));
        System.out.println(String.format("Cantidad de 1: %d",uno));
        System.out.println(String.format("Cantidad de 2: %d",dos));
        System.out.println(String.format("Cantidad de 3: %d",tres));
        System.out.println(String.format("Cantidad de 4: %d",cuatro));
        System.out.println(String.format("Cantidad de 5: %d",cinco));
        System.out.println(String.format("Cantidad de 6: %d",seis));
        System.out.println(String.format("Cantidad de 7: %d",siete));
        System.out.println(String.format("Cantidad de 8: %d",ocho));
        System.out.println(String.format("Cantidad de 9: %d",nueve));

    }
}

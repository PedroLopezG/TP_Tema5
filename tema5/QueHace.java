package tema5;

public class QueHace {
    //Ejercicio6
    public void tabla(){
    final int T = 4;
    int i, j,val;
    int[][] tab1 = new int[T][T];
    int[][] tab2 = new int[T][T];
//    Enunciado
//    val = 1;
//    for (j=0;j<T;j++){
//        for (i=0;i<T;i++){
//            tab2d[j][i] = val;
//            val = val + 1;
//        }
//    }

        val = 1;
    for (j=0;j<T;j++){
        for (i=0;i<T;i++){
            tab1[i][j] = val;
            val = val + 1;
        }
    }

        val = 0;
        for (j=0;j<T;j++){
            for (i=0;i<T;i++){
                tab2[i][j] = val;
                val = val + 1;
            }
            val = j +1;
        }




        System.out.println("La primera modificacion es: ");
        imprimir(tab1);
        System.out.println("\nY la segunda es:");
        imprimir(tab2);
    }

    public void imprimir(int[][] tab2d){
        for (int j=0;j<tab2d.length;j++){
            for (int i=0;i< tab2d.length;i++){
                System.out.print(" "+tab2d[j][i]);
            }
            System.out.println("");
        }


    }
}

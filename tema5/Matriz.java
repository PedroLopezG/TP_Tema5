package tema5;
//Ejercicio 7
public class Matriz {
    
    public void matriz(){
        int matriz [][] = new int [20][30];

        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
              matriz[x][y] = (int) (Math.random()*9+1);
            }
          }
        

        for (int x=0; x < matriz.length; x++) {
            System.out.print("");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println();
          }

    }
}

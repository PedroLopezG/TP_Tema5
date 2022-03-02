public class DespegueInmediato {
    
    public void despegue(){

        int i = 0;
        int num = 10;
        int tabla[] = new int[10];
        for(i = 0; i<10; i++){
            tabla[i] = num;
            num--;
        }

        for (int j = 0; j < tabla.length; j++) {
            System.out.println(tabla[j]);
        }
    }
}

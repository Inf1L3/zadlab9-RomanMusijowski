package pl.edu.ur.oopl9;

import java.util.Random;

public class Zadanie_1 {
    Random rand = new Random();

    public static int[] losowanie(int[] losowanie){
        Random rand = new Random();
        for(int i =0;i<100;i++){
            losowanie[i]=rand.nextInt();
            System.out.println(losowanie[i]);

        }
        return losowanie;
    }
}

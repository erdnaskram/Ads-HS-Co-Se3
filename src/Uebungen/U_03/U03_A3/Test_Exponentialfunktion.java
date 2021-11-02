package Uebungen.U_03.U03_A3;

import java.util.Random;


public class Test_Exponentialfunktion {

    public static void main(String[] args) {
        Random rn = new Random();

        Exponentialfunktion.pow(1,1);

        for (int i = 0; i < 20; i++) {
            long x = rn.nextInt(40);
            int n = rn.nextInt(10);

            long time = System.nanoTime();

            long res =Exponentialfunktion.pow(x,n);

            time = System.nanoTime() - time;

            System.out.println("pow(" + x + ", " + n + ") = " + res);
            System.out.println("time = " + time);
        }
    }
}

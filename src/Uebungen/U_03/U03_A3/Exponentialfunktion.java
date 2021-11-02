package Uebungen.U_03.U03_A3;

public class Exponentialfunktion {

    public static long pow(long x, int n) {
        //Basisfälle
        if (x == 0){
            return 0;
        } else if (n == 0){
            return 1;
        } else if (n == 1){
            return x;
        } else if (n == 2){
            return x * x;
        }

        //Rekursion
        else if (n % 2 == 0){
            return pow(pow(x,2),n / 2);
        } else {
            return pow(pow(x, (n-1)/2),2) * x;
        }
    }
}

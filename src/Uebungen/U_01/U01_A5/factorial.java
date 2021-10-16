package Uebungen.U_01.U01_A5;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("""
                Willkommen zum multiblen Fakultät-Rechner!

                Gebe eine Zahl ein:""");

        int n = sc.nextInt();

        System.out.println("factorialRekursion(" + n + ") = " + factorialRekursion(n));
        System.out.println("factorialIteration(" + n + ") = " + factorialIteration(n));
    }

    public static double factorialRekursion(int n) {//returns factorial of n
        if (n <= 1){
            return n;
        } else {
            return n * factorialRekursion(n-1);
        }
    }

    public static double factorialIteration(int n) {//returns factorial of n
        double result = 1;
        for (int j = n; j > 0; j--) {
            result = result * j;
        }
        return result;
    }

}

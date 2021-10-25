package Uebungen.U_01.U01_A6;

public class ggTCalculatorV3 {

    public static void main(String[] args) {
        System.out.println("ggT(1978,2021) = " + ggT(1978, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(0, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(1978, 0));
    }

    public static int ggT(int number1, int number2){
        if (Math.min(number1, number2) == 0) {
            return Math.max(number1, number2);
        } else if (number1 < number2){
            return ggT(number1, number2 % number1);
        } else{
            return ggT(number1 % number2, number2);
        }
    }


}
package Uebungen.U_01.U01_A1;

public class ggTCalculatorV1 {

    public static void main(String[] args) {
        System.out.println("ggT(1978,2021) = " + ggT(1978, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(0, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(1978, 0));
    }

    public static int ggT(int number1, int number2){
        int rest;
        if (number1 == 0){
            return number2;
        } else if (number2 == 0){
            return number1;
        } else {
            do{
                if (number1 > number2){
                    rest = number1 % number2;
                    if (rest != 0)
                        number1 = rest;
                } else {
                    rest = number2 % number1;
                    if (rest != 0)
                        number2 = rest;
                }

            } while (rest != 0);

            return Math.min(number1, number2);
        }
    }


}
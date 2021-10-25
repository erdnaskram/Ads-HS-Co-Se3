package Uebungen.U_01.U01_A2;

public class ggTCalculatorV2 {

    public static void main(String[] args) {
        System.out.println("ggT(1978,2021) = " + ggT(1978, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(0, 2021));
        System.out.println("ggT(1978,2021) = " + ggT(1978, 0));
    }

    public static int ggT(int number1, int number2){
        if (number1 == 0){
            return number2;
        } else {
            do{
                if (number1 > number2){
                    number1 = number1 - number2;
                } else {
                    number2 = number2 - number1;
                }

            } while (number2 != 0);

            return number1;
        }
    }


}
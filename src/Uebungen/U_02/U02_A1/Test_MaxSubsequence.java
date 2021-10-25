package Uebungen.U_02.U02_A1;

import static Uebungen.U_02.U02_A1.maxSubsequence.maxSubSumRec;

public class Test_MaxSubsequence {

    public static void main(String[] args) {
        int[] numbers = {3, -4, 2, 2, -3, 1, 3, -2};
//        Lösung wäre 5

        System.out.println("maxSubSumRec(numbers, 0, numbers.length-1) = " + maxSubSumRec(numbers, 0, numbers.length - 1));
    }
}

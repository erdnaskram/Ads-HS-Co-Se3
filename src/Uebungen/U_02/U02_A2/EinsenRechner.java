package Uebungen.U_02.U02_A2;

public class EinsenRechner {

    public static int countOnes(int zahl) {
        if (zahl == 1 || zahl == 0)
            return zahl;
        else
            return zahl % 2 + countOnes(zahl / 2);
    }
}

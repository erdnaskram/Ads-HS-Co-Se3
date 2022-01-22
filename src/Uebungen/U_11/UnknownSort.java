package Uebungen.U_11;

public class UnknownSort {

    public static int[] unknowSort(int[] a, int i) {
            int temp = a[i];
            int j = i;
            while (j > 0 && (temp < a[j-1])) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        return a;
    }
}

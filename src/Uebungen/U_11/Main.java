package Uebungen.U_11;

public class Main {
    public static void main(String[] args) {

        int[] a = {5, 8,6,1,2,7,3,9};
        int n = a.length;

        System.out.print("n: " + 0 +" | ");
        for (int i1 : a) {
            System.out.print(i1 + ", ");
        }
        System.out.print("\n" + "-----+------------------------" + "\n");

        for (int i = 1; i < n; i++) {
            a = UnknownSort.unknowSort(a,i);
            System.out.print("n: " + i +" | ");
            for (int i1 : a) {
                System.out.print(i1 + ", ");
            }
            System.out.print("\n");
        }

    }
}

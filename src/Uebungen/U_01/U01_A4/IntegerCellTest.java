package Uebungen.U_01.U01_A4;

public class IntegerCellTest {
    public static void main(String[] args) {
        IntegerCell i = new IntegerCell (30);
        IntegerCell j = new IntegerCell (50);
        IntegerCell resultat = i.add(j);
        System.out.println("resultat = " + resultat);
    }
}

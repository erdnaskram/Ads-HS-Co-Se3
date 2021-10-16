package Uebungen.U_01.U01_A4;

public class IntegerCell {
    int number;

    public IntegerCell(int number) {
        this.number = number;
    }

    // Add two IntegerCell numbers
    public IntegerCell add(IntegerCell right) {
        return new IntegerCell(this.number + right.number);
    }

    // Subtract two IntegerCell numbers
    // return a IntegerCell result object
    public IntegerCell subtract(IntegerCell right) {
        return new IntegerCell(this.number - right.number);
    }

    // Multiply two IntegerCell numbers
    // return a IntegerCell result object
    public IntegerCell multiply(IntegerCell right) {
        return new IntegerCell(this.number * right.number);
    }

    // Divide two IntegerCell numbers
    // return a IntegerCell result object
    public IntegerCell division(IntegerCell right) {
        return new IntegerCell(this.number / right.number);
    }

    public void toScreen() {
        System.out.println("Wert " + this.toString());
    }

    // Return String representation of a IntegerCell number
    public String toString() {
        return String.valueOf(number);
    }
}

package Uebungen.U_02.U02_A1;

public class maxSubsequence {

    public static int maxSubSumRec(int[] a, int left, int right) {
        // Basisfall: Array der Länge 1
        if (right-left <= 0)
            if (a[left] < 0)
                return 0;
            else
                return a[left];
        else {
            int[] currA = new int[right-left+1];
            System.arraycopy(a,left, currA, 0, right-left+1);
            
            int sizeLeft = currA.length / 2;
            int sizeRight = currA.length - sizeLeft;
            int[] leftA = new int[sizeLeft];
            int[] rightA = new int[sizeRight];

            // Halbiere Array in linkes und rechtes Teilarray
            System.arraycopy(a, left, leftA, 0, sizeLeft);
            System.arraycopy(a, left+sizeLeft, rightA, 0, sizeRight);

            // berechne rekursiv max Sub Wert jeder Hälfte
            int maxLeftSum = maxSubSumRec(a, left, left+sizeLeft-1);
            int maxRightSum = maxSubSumRec(a, left+sizeLeft, right);

            // die Berechnung erfolgt jeweils durch eine for-Schleife
            int maxLeftArray = 0;
            int tempSumL = 0;
            for (int i = leftA.length-1; i >= 0; i--) {
                tempSumL += leftA[i];
                if (tempSumL > maxLeftArray)
                    maxLeftArray = tempSumL;
            }

            int maxRightArray = 0;
            int tempSumR = 0;
            for (int i : rightA) {
                tempSumR += i;
                if (tempSumR > maxRightArray)
                    maxRightArray = tempSumR;
            }
            // nehme das Maximum der 3 Summen
            return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftArray + maxRightArray);
        }
    }
}

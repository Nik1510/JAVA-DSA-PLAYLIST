package DSA_Question;

import java.util.Arrays;

public class Q_66 {
    public static void main(String[] args) {
        int[] arr={4,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static  int[] plusOne(int[] a) {
        int n = a.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }

        // If all digits were 9, we need an extra digit //{9,9}
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}

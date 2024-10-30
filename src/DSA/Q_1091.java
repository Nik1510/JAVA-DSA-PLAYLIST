package DSA;

import java.util.Arrays;

public class Q_1091 {
    static int[] nextLargerNodes(int[] a,int n) {
        int[] arr = new int[n]; // created an array of n size
        int j = 0;
        int k = j + 1;
        while (j < n - 2) {
            if (a[k] > a[j]) {
                arr[j] = a[k];
            }
            k++;
            if (k == n - 2) {
                j++;
                k = j + 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {2,1,5};
        int[] a= nextLargerNodes(arr, 3);
        System.out.println(Arrays.toString(a));
    }
}

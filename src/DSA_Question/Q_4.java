package DSA_Question;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Q_4 {


    public static void main(String[] args) {
        int[] n1 = {1,3};
        int[] n2 = {2};
        int[] n3 = {1,2};
        int[] n4 = {3,4};

        System.out.println(findMedianSortedArrays(n1, n2));
        System.out.println(findMedianSortedArrays(n3, n4));
    }
    static double findMedianSortedArrays(int[] n1, int[] n2) {
        double median ;
        int j=0;
        int l = (n1.length)+(n2.length);
        int[] arr = new int[l];
        for(int i =0;i<l;i++ ){

            if(i<=n1.length-1){
                arr[i] = n1[i];
            }
            else{
                arr[i] = n2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            // Even length: average of the two middle elements
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // Odd length: middle element
            median = arr[n / 2];
        }

        return median;
    }
}

package arunesh;

import java.util.Arrays;

public class Q_189 {
   static void rotate(int[] arr, int k) {

        int n = arr.length;
        k =k%n;

        RotateArray(arr , 0 , n - 1);

        RotateArray(arr , 0 , k - 1);

        RotateArray(arr , k , n -1);
       System.out.println(Arrays.toString(arr));


    }

    static void RotateArray(int[] arr , int start , int end){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int k =3;
        rotate(arr, k);

    }
}

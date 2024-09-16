package DSA;

import java.util.Arrays;

public class Qusetion_Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
//        swap(arr, 1, 4);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // finding max values
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Reversing  an array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
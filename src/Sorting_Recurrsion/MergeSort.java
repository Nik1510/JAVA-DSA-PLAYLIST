package Sorting_Recurrsion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1 };
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length /2;
        //Arrays.copyOfRange--> inbuilt function of the array

        int[] left  = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge (int[] first,int[] second){
        int[] mix = new int[first.length + second.length];

        int i =0;
        int j=0 ;
        int k =0;

        while(i< first.length && j< second.length){
            if (first[i] <second[i]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that on may not be complete
        // copy the remaining element
        // either i will be smaller  than length or j will be smaller than the length
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = first [j];
            j++;
            k++;
        }
        return mix;
    }

}

package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Duplicates {
    public static void main(String[] args) {
        int [] arr ={2,3,1,2,3};
        System.out.println(duplicates(arr));

    }
    static ArrayList<Integer> duplicates(int[] a) {
        // code here
        ArrayList <Integer> arr = new ArrayList<>();
        int j=0;
        Arrays.sort(a);
        for(int i=0; i<a.length-1;i++){
            if(a[i]==a[i+1]){
                arr.add(a[i]);
                j++;
            }
        }
        if (j==0){
            arr.add(-1);
            return arr;
        }
        return arr;
    }
}

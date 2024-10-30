package DSA;

import java.util.ArrayList;

public class gfgPotd {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
       if(arr[0]==arr[1]){
           a.add(arr[0]);
       }else{
           a.add(arr[0]);
           a.add(arr[1]);
       }
        for(int i =1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                a.add(arr[i]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,7,5};
        System.out.println(removeDuplicate(arr));
    }
}

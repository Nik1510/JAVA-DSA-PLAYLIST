package Leetcode_Problems;

import DSA_Recursion.BS;
// wrong hai
public class K_th_Missing_Positive_Number_1539 {
    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4,5};
        int k =6;
        System.out.println(BinearSearch(arr,k));
     }
    static int BinearSearch(int[] arr, int k){
        int low =0;
        int high = arr.length-1;
        while(low<= high){
            int mid =low+(high-low)/2;
            if(arr[mid]-(mid+1)>=k){
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return low+k;
    }
}

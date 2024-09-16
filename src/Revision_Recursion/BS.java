package Revision_Recursion;

public class BS {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 55, 66, 78};
        int target = 0;
        System.out.println(BS(ar, 0, ar.length-1, target));
    }
    static int BS(int[] arr, int start, int end , int target){

            if (start>end){
                return -1;
            }
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (target<arr[mid]){
                return BS(arr,start,mid-1,target);
            }
            else {
               return BS(arr,mid+1, end, target);
            }
    }
}

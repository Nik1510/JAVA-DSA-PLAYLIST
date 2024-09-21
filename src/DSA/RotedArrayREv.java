package DSA;

public class RotedArrayREv {
    static int findPivot(int [] arr){
        int start =0 ;
        int end = arr.length;
        while(start<=end){
            int mid =start +(end-start)/2;
            // 4 cases
            if ( mid<end && arr[mid]>arr[mid+1] ){
                return mid;
            }
            if ( mid>start &&  arr[mid]<arr[mid+1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int BS(int[] arr,int target){
        int pivot = findPivot(arr);
        // if you donot find the pivot
        if(pivot==-1){
        return BinaryS(arr, target, 0, arr.length-1);
        }
        // if pivot is found , you have found 2 asending sorted array
        if (arr[pivot]==target){
            return pivot;
        }
        if (target >= arr[0]){
            return BinaryS(arr, target, 0, pivot-1);
        }
        return BinaryS(arr, target, pivot+1, arr.length-1);
    }
    static int BinaryS(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid;
            }else {
                end=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}

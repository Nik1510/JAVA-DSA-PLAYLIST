package DSA;
//      https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {


    }
    int search(int[] arr, int target ){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target,peak+1,arr.length-1);
    }
    static int orderAgnosticBS(int[] arr , int target ,int start, int end ){

        // find weather the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            // find rhe middle element
//            int mid =(start+end)/2;
//              might be possible that ( start + end) exceeds the range of integer value
            int mid = start+ (end -start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1; // elements does not exist
    }

    // searching the peak of an array i.e. index
    static int peakIndex(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        int mid =0;
        while(start>end){
            mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
             // array is decreasing now
             end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start ;
    }
}

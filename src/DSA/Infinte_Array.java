package DSA;
/*
https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
// find position of an element in a sorted array of a Infinite Array
public class Infinte_Array {
    public static void main(String[] args) {
        // start with the box of size 2
        int[] arr= {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));


    }
    // When ever there is a Question of sorted Array
    // first things that should click in mind is
    //          Binary Search

    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
            while(target>arr[end]){
                int newStart =end +1;
                // double the box value
                // end = previous end + sizeOfBox*2
                end = end+ (end - start+1)*2;
                start = newStart;
            }
            return binarySearch2(arr, target,start,end);
    }
    static int binarySearch2(int [] arr,int target, int start,int end){

        // while loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        // if no target element is not present
        return -1;
    }
}

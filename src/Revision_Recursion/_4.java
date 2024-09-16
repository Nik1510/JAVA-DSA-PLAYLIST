package Revision_Recursion;

public class _4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 0;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Target not found
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            return BinarySearch(arr, target, start, mid - 1); // Search left half
        } else if (target > arr[mid]) {
            return BinarySearch(arr, target, mid + 1, end); // Search right half
        } else {
            return mid; // Target found
        }
    }
}
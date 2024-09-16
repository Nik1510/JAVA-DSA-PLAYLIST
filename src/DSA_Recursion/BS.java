package DSA_Recursion;

public class BS {
    // Problem on binary search: How to approach a problem with the
    // help of recursion
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(ar, target, 0, ar.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
        // When calling a function, make sure the result of the function call
        // matches the return type.
//        all there memory will be occupied in stack until the answer is returned
    }

}

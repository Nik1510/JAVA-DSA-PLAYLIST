package GFG;

public class MissingArray {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
        int n = 2; int[] arr  = {1};
        System.out.println(missingNumber(n,arr));

    }
    static int missingNumber(int n, int arr[]) {
       int totalSum= n*(n+1)/2;
        int actualSum =0;
        // Your Code Here
        for(int i =0;i<arr.length;i++){
           actualSum+=arr[i];
        }
        return (totalSum-actualSum);
    }
}

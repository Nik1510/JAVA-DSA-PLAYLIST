package DSA;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
        System.out.println(Max(arr));
    }
   // assume arr.length is !=0
    // return the minimum value in the array
    static int  min(int[] arr){
        // Running for loop to find min number in the array
            int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if( arr[i] < ans ){
                ans = arr[i];
            }
        }
            return ans;
    }
    static int Max(int[] arr){
        // assuming the array is not empty
        int ans = arr[0]; // Assuming it is the biggest or highest number
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}


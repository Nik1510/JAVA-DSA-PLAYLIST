package DSA;

public class GFG {
        static long findSmallest(int[] arr) {
            // Your code goes here

            long count =1;
            for(int i =0; i<arr.length;i++){
                if(arr[i]>count){
                    return count;
                }
                count+=arr[i];
            }
            return count;
        }

    public static void main(String[] args) {
            int[] arr= {1, 6, 9, 10, 20, 28};
        System.out.println(findSmallest(arr));
    }

}

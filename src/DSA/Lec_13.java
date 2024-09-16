//package DSA;
//
////import org.jetbrains.annotations.Contract;
//import org.jetbrains.annotations.NotNull;
//
//public class Lec_13 {
//    public static void main(String[] args) {
//        int[] nums ={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target= 19;
//        int ans = linearSearch(nums,target);
//        System.out.println(ans);
//    }
//    // search in the array; return the index if item found
//    //otherwise if item not found return -1
//
//    static boolean linearSearch(int  [] arr, int target){
//        if (arr.length ==0){
//            return false;
//        }
//        // run a for loop
//        for (int index = 0; index < arr.length ; index++) {
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if(element == target){
//                return true;
//            }
//
//        }
//        // this line will execute if none of the return statements above have executed
//        // hence the target not found
//        return false;
//    }
//    static int linearSearch2(int[] arr, int target){
//        if(arr.length==0){
//            return Integer.MAX_VALUE;
//        }
//        // run a for loop (advanced loop)
//        for (int element :arr){
//            if (element == target){
//                return element;
//            }
//        }
//        // this line will execute if none of the return statements above have executed
//        // hence the target not found
//        return -1;
//    }
//}

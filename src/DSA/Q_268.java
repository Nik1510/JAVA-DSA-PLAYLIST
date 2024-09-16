import java.util.*;

public class Q_268 {
    public static void main(String[] args) {
        int [] arr ={3,5,1,4};
        int a= missingNumber(arr);
        System.out.println(a);
    }
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        //Search for first missing Number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        // case 2
        return arr.length + 1;
    }
    static void swap(int[] arr, int start, int end){
        int extra = arr[start];
        arr[start] = arr[end];
        arr[end] = extra;
    }
}

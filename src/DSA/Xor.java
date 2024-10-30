package DSA;

public class Xor {
    static int getSingle(int arr[]) {
        // code here
        int a =arr[0];
        for(int i =1; i<arr.length;i++){
            a^=arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2};
        System.out.println(getSingle(arr));
    }
}

package DSA_Question_Bit_Wise;
// question find non- duplicate element in the array
// we use XOR operator to find this
public class FIndUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
//        System.out.println(ans(arr));
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
    // brute force method

}

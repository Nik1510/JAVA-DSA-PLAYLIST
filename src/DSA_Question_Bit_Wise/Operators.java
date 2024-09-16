package DSA_Question_Bit_Wise;


public class Operators {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return ((n &1)==1);
    }
}

package DSA_Question_Bit_Wise;


public class SetBits {
    public static void main(String[] args) {
        int n = 234567;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
//   ---------------method 1----------------------------------
//        while(n >0){
//            count++;
//            n-= (n&-n);
//        }
//        return count ;
//        ---------------------- Ends here --------------------------------

        while (n>0){
            count++;
            n = n &(n-1);
        }
        return count;
    }


}

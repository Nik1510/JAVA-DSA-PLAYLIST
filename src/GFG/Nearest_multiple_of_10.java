package GFG;

import java.math.BigInteger;

public class Nearest_multiple_of_10 {

    // only can handle small number
//    static String roundToNearest(String str) {
//        // Complete the function
////        long a = Integer.valueOf(str) ;
//        long a = Long.parseLong(str)
//        long s=0;
//        if(a%10>5){
//            long f = 10-a%10;
//            s= a+f;
//
//        }else{
//            s= a-a%10;
//        }
//        return String.valueOf(s);
//    }
    static String roundToNearest(String str){
        BigInteger a = new BigInteger(str);
        BigInteger s = BigInteger.ZERO; // to store sum
        BigInteger ten = BigInteger.TEN; // ten =10;
        BigInteger remainder = a.mod(ten); // has the last index

        if(remainder.compareTo(BigInteger.valueOf(5))>0){
            BigInteger f = ten.subtract(remainder);
            s= a.add(f);
        }else{
            s=a.subtract(remainder);
        }
        return s.toString();

    }

    public static void main(String[] args) {
        System.out.println(roundToNearest("39918170518645084488358420102776921"));
    }


}

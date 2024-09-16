package Revision_Recursion;


public class _9_count_Zeros {
    // count number of zeros in the number

//    static int zeors(int n){
//        int c=0;
//        while(n!=0){
//            if(n%10 == 0){
//                c++;
//            }
//            n/=10;
//        }
//        return c;

    // now with the help of recursion


    static int count(int n){
        return helper(n,0);
    }

    //special pattern how to pass a value to above calls
    static int helper(int n , int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }else {
            return helper(n/10,c);
        }

    }
    public static void main(String[] args) {
//        int x= zeors(30204);
//        System.out.println(x);
        int x=count(3020004);
        System.out.println(x);

    }
}

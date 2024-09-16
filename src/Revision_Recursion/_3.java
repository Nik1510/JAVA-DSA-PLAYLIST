package Revision_Recursion;

public class _3 {
    public static void main(String[] args) {
//    Q:- Find the nth fibonacci number
//        0,1,1,2,3 ,5, 8, 13
//        int ans = 5;
//        System.out.println(fib(ans));
        System.out.println(fib(1));
    }

    static int fib(int n) {
//       Base condition

        if(n<2){
            return n;
        }
//        System.out.println( "first term"+(n-1)+" second term"+(n-2));
        return fib(n-1) +fib(n-2);

    }
}

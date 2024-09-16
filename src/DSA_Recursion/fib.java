package DSA_Recursion;
// fibonnaci Number
public class fib {
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++) {
         //   System.out.println(fiboFormula(10));
        //}
        System.out.println(fiboFormula(4));
        System.out.println(fibo(5));
        System.out.println(fiboE(5));
    }
    static int fiboFormula(int n) {
        // just for demo , use long instead
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n ) /Math.sqrt(5));
    }
    static int fibo(int n) {
        // base condition
        if(n<2){
         return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }

    static int fiboE(int n) {
        // base condition
        if(n<2){
            return n;
        }

        return fiboE(n-1)+ fiboE(n-2);
    }


}

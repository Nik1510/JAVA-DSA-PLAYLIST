package Revision_Recursion;

public class _8_Palindrome {

    static boolean palin(int n){
        int y =n; int x =0;
        while(n!=0){
            x=x*10+ n%10;
            n=n/10;
        }
        return (y==x);
    }
    static int rev2(int n){
        //sometimes you might need some additional variables in the argument
        // in that case , make another function
        // let's assume a case here to understand it
        // N =1234 . so to reverse that function you need
        // 4*1000+3*100+2*10+1
        // F(N,ARGUMENT = rem *10^agu-1 +F(N/10,agu-1)

        int digits =  (int)(Math.log10(n)+1);
        return helper(n,digits);
    }
    static int helper (int n , int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem *(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palin2(int n){
        return n==rev2(n);
    }
    public static void main(String[] args) {
        System.out.println(palin(1234321));
//   Methods 2
        System.out.println(palin2(1234321));
    }

}

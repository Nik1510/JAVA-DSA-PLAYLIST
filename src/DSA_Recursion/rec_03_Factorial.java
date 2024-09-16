package DSA_Recursion;

public class rec_03_Factorial {
    public static void main(String[] args) {
//        int ans = fact(5);
//        System.out.println(ans);
        int s = sum(1345);
        System.out.println(s);
    }
    static int fact (int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}

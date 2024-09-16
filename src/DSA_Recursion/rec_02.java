package DSA_Recursion;
// important concept for recursion
public class rec_02 {
    public static void main(String[] args) {
        funComp(5);
    }
    // important concept
    static void fun(int n){
        if(n==0){
            return;
        }
        // this function prints every time when it puts value in stack memory
        System.out.println(n);// see how this function is executed and calls .
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }
        // this function prints every time when it empties the  stack memory
        funRev(n-1);
        System.out.println(n);
    }
    static void funComp(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funComp(n-1);
        System.out.println(n);
    }
}

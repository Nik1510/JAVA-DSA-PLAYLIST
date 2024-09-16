package Revision_Recursion;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(100));

    }
    static int count(int x){
       return helper(x,0);
    }
    static int helper(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem ==0){
            return helper(n/10, count+1);
        }
        return helper(n/10,count);
    }
}

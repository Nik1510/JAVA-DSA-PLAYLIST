package DSA_Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
    //    fun(n--); // exception :- stack overflow
          fun(--n);
//          n-- vs --n
    }
}
/*
    Understanding n-- vs. --n:
n--: Post-decrement. It returns the current value of n, then decrements n by 1.
--n: Pre-decrement. It decrements n by 1, then returns the new value of n.
Issue:
The recursion is causing infinite calls because the value of n is not decrementing as expected in the first recursive call due to post-decrement n--.
 The value passed to fun(n--) is always the same, leading to infinite recursion.

Solution:
Use pre-decrement --n to ensure the value of n is decremented before the function call.
Remove the redundant second recursive call to simplify the function.
 */
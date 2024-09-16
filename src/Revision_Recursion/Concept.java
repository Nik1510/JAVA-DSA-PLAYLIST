package Revision_Recursion;

public class Concept {
    public static void main(String[] args) {

//        countDown1(5);
        countDown(5);

//  ---------------------REASON----------------------------------------------------------------------------------------------

    // there is huge difference between n-- v/s --n
        /*
        In programming, the n-- operation is known as the post-decrement operator.
        It’s used to decrease the value of the variable n by one after the current operation is completed.
         When you mention “n-- represent a recursive function,”
          it seems you’re referring to using this operator within the context of a recursive function.


            If you want to use n-- in a recursive function,
             it’s important to remember that the value of n will be passed to the recursive call before it is decremented.
             Here’s an example of how you might use n-- in a recursive function:
         */
    }
    static void countDown1(int n){
        if(n > 0){
            System.out.println(n); // Print the current value of n
//            donot use it
            countDown1(n--); // Recursive call with n, then decrement n ,
            /*
            However,
             this will result in an infinite loop because n-- passes the current value of n to the recursive call and then decrements it.
             The value of n never changes before the next call, so the base case if(n > 0) is always true.
             */
        }
    }
    /*
    To fix this, you should use --n, which is the pre-decrement operator,
    decrementing n before passing it to the next function call:
     */


    static void countDown(int n){
        if(n > 0){
            System.out.println(n); // Print the current value of n
            countDown(--n); // Decrement n, then make the recursive call
        }
        /*
        Now, the function will correctly count down from n to 1,
        as n is decremented before each recursive call,
         eventually reaching the base case where n is no longer greater than 0.
         */
    }

}

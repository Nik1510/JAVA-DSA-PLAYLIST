package DSA_Recursion;

public class rec_01 {
    public static void main(String[] args) {
        // write a function that prints hello world
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        // recursive call
        // if you call a function again and again , you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        System.out.println(n);
        print(n+1);
    }

}

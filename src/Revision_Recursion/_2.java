package Revision_Recursion;

public class _2 {
    public static void main(String[] args) {
//        write a function that takes in a number and prints it
        // prints first 5 number // 1 , 2, 3, 4, 5
//        print1(1);
        recursion(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(n+1);
    }
    static void print2(int n){
        System.out.println(n);
        print3(n+1);

    }
    static void print3(int n){
        System.out.println(n);
        print4(n+1);

    }
    static void print4(int n){
        System.out.println(n);
        print5(n+1);

    }
    static void print5(int n){
        System.out.println(n);
    }

    static void recursion(int n){

        // why to use base condition
//        functions calls will keep happening and the stacks memory will keep going to br
        // to filled and we know every calls takes memory
        // so stacks overflow
//        52 min
        if(n==5){
            System.out.println(n);
            return;
        }
//        System.out.println(n);
        recursion(n+1);
        // let's see how the number load in stack memory
        System.out.println(n);

    }
}

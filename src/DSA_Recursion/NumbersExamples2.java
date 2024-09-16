package DSA_Recursion;

public class NumbersExamples2 {
    public static void main(String[] args) {
        // write a function that takes ina number and prints it
        // print first 5 numbers : 1 2 3 4 5
        print(1);
    }
    static void print(int num)
    {
        // if condition is a check statement
        // this condition is know as base condition
        // base condition
        if(num == 5){
            System.out.println(5);
            return;
        }
        System.out.println(num);
        print(num+1);
    }
}

package DSA;

import java.util.Scanner;

public class Assigment_1 {
    public static void main(String[] args) {
        // Problem 1 :- To check Weather the year is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year you want to check ");
        int a = sc.nextInt();
        if(a % 4 == 0){
            System.out.println(" Yes! it is a leap year ");
        }
        else {
            System.out.println("Not a leap year ");
        }
    }
}

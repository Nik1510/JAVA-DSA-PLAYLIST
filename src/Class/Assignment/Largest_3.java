package Class.Assignment;

import java.util.Scanner;

public class Largest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x>y && x>z){
            System.out.println("X is grestest  "+x);
        }
        if (y>x && y>z){
            System.out.println("Y is grestest "+y);
        }
        else {
            System.out.println("Z is grestest "+z);
        }

    }
}

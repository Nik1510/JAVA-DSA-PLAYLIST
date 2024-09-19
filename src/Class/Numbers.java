package Class;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        System.out.println(((x%2==0)?"Even":"ODD"));
    }
}

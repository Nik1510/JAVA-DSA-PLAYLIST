package Class.Assignment;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int gc=1;
        for(int i =1 ; i<x;i++){
            if(x%i==0){
                gc=i;
            }
        }
        System.out.println("the GCD Number "+gc);
    }
}

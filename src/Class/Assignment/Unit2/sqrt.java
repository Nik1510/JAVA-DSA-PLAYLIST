package Class.Assignment.Unit2;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        // find sqrt without using  method
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i*i==n){
                System.out.println("The sqrt of the number is "+i);
                a= false;
            }
        }
        if(a){
        System.out.println("the number doesn't has any exact root");
        }
    }
}

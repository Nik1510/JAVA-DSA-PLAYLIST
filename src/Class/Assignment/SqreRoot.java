package Class.Assignment;

import java.util.Scanner;

public class SqreRoot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        boolean a =true;
        for(int i =2 ;i<=x/2;i++){
            if(i*i==x){
                System.out.println("The Number is "+i);
                a =false;
            }
        }
        if (a){
            System.out.println("Number is not a perfect square");
        }

    }
}

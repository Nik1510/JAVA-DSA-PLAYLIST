package Class.Assignment.Unit2;

import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many subjects do you want to insert");
        int s = sc.nextInt();
        int total=0;
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.printf("Enter the marks of the %d subject\t", i+1);

            arr[i] = sc.nextInt();
            total+=arr[i];
        }
        System.out.println("The total marks to be obtained is\t"+total);
        System.out.println("the percentage obtained "+ (float)(total)/s );

    }
}

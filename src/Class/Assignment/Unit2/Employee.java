package Class.Assignment.Unit2;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of the Employee: ");
        long salary = sc.nextLong();

        double hr = 0.10 * salary;
        double da = 0.08 * salary;
        double grossSalary = salary + hr + da;

        double tax = 0.05 * grossSalary;
        double netSalary = grossSalary - tax;

        System.out.println("Employee salary breakdown");
        System.out.printf("Basic: \t\t%.2f\n", (double)salary);
        System.out.printf("HRA: \t\t%.2f\n", hr);
        System.out.printf("DA: \t\t%.2f\n", da);
        System.out.printf("Gross Salary: \t%.2f\n", grossSalary);
        System.out.printf("Tax Deduction: \t%.2f\n", tax);
        System.out.printf("Net Salary: \t%.2f\n", netSalary);
    }
}

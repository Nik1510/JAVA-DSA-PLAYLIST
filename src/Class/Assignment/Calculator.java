package Class.Assignment;

public class Calculator {

    // User-defined method for adding two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // User-defined method for calculating the square of a number
    public double square(double x) {
        return x * x;
    }


    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();

        // Call user-defined methods
        int sum = calc.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum);

        double sq = calc.square(4);
        System.out.println("Square of 4 is: " + sq);

        // Predefined method from Math class
        double squareRoot = Math.sqrt(25);  // Predefined method in Java
        System.out.println("Square root of 25 is: " + squareRoot);
    }
}


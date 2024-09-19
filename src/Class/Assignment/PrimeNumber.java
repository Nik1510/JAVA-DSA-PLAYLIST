import java.util.Scanner;

public class PrimeNumber {
    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int limit = sc.nextInt();

        System.out.print("Alternate prime numbers up to " + limit + " are: ");
        int count = 0;
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                if (count % 2 == 0) {
                    System.out.print(num + " ");
                }
                count++;
            }
        }
    }
}

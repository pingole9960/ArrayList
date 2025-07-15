import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt(); // nth prime to find

        int count = 0; // number of primes found
        int num = 2;   // number to check for prime

        while (true) {
            boolean isPrime = true;

            // Check if current number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th prime number is: " + num);
                    break; // stop loop once we find nth prime
                }
            }

            num++; // check next number
        }
    }
}

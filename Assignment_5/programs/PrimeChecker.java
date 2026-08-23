import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isPrime = number >= 2;

        for (int divisor = 2; divisor * divisor <= number && isPrime; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}

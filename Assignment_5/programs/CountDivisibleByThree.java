import java.util.Scanner;

public class CountDivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();
        int count = 0;

        for (int number = 1; number <= n; number++) {
            if (number % 3 == 0) {
                count++;
            }
        }

        System.out.println("There are " + count + " numbers divisible by 3 between 1 and " + n + ".");
        input.close();
    }
}

import java.util.Scanner;

public class SumFromOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();
        int sum = 0;

        for (int number = 1; number <= n; number++) {
            sum += number;
        }

        System.out.println("The sum from 1 to " + n + " is: " + sum);
        input.close();
    }
}

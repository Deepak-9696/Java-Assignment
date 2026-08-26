import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int target = input.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " occurs " + count + " times in the array.");
        input.close();
    }
}

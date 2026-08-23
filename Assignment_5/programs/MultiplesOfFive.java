public class MultiplesOfFive {
    public static void main(String[] args) {
        System.out.println("Multiples of 5 from 1 to 100:");

        for (int number = 1; number <= 100; number++) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}

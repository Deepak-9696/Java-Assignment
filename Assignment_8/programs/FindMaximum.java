class MaxFinder {
    // Maximum between two integers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Maximum between three integers
    public int max(int a, int b, int c) {
        int temp = (a > b) ? a : b;
        return (temp > c) ? temp : c;
    }

    // Maximum between two decimal numbers
    public double max(double a, double b) {
        return (a > b) ? a : b;
    }
}

public class FindMaximum {
    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();

        System.out.println("Maximum between 10 and 20: " + finder.max(10, 20));
        System.out.println("Maximum between 10, 50, and 30: " + finder.max(10, 50, 30));
        System.out.println("Maximum between 10.5 and 20.7: " + finder.max(10.5, 20.7));
    }
}

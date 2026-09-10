class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two decimal numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorAddition {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers (10, 20): " + calc.add(10, 20));
        System.out.println("Addition of three integers (10, 20, 30): " + calc.add(10, 20, 30));
        System.out.println("Addition of two decimal numbers (10.5, 20.5): " + calc.add(10.5, 20.5));
    }
}

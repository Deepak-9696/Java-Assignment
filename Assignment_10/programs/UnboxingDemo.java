public class UnboxingDemo {
    public static void main(String[] args) {
        Integer numberObject = 250;
        Double priceObject = 89.50;
        Character gradeObject = 'B';
        Boolean passedObject = false;

        int number = numberObject;
        double price = priceObject;
        char grade = gradeObject;
        boolean passed = passedObject;

        System.out.println("UNBOXING DEMONSTRATION");
        System.out.println("======================");
        System.out.println("Integer   -> int     : " + number);
        System.out.println("Double    -> double  : " + price);
        System.out.println("Character -> char    : " + grade);
        System.out.println("Boolean   -> boolean : " + passed);
    }
}

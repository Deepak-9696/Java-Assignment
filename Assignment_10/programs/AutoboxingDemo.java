public class AutoboxingDemo {
    public static void main(String[] args) {
        int number = 100;
        double price = 45.75;
        char grade = 'A';
        boolean passed = true;

        Integer numberObject = number;
        Double priceObject = price;
        Character gradeObject = grade;
        Boolean passedObject = passed;

        System.out.println("AUTOBOXING DEMONSTRATION");
        System.out.println("========================");
        System.out.println("int     -> Integer   : " + numberObject);
        System.out.println("double  -> Double    : " + priceObject);
        System.out.println("char    -> Character : " + gradeObject);
        System.out.println("boolean -> Boolean   : " + passedObject);
    }
}

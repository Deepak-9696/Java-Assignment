import java.util.Scanner;

public class EmailAddressInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);

        input.close();
    }
}

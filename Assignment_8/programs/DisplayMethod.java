class Display {
    // Display only student's name
    public void show(String name) {
        System.out.println("Student Name: " + name);
    }

    // Display student's name and age
    public void show(String name, int age) {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    // Display student's name, age, and marks
    public void show(String name, int age, double marks) {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class DisplayMethod {
    public static void main(String[] args) {
        Display disp = new Display();

        disp.show("Rahul Sharma");
        disp.show("Rahul Sharma", 20);
        disp.show("Rahul Sharma", 20, 85.5);
    }
}

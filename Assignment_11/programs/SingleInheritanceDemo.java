class Person {
    protected String name;
    protected int age;
    protected String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void displayPersonDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
    }
}

class Student extends Person {
    private int studentId;
    private String course;

    Student(String name, int age, String email, int studentId, String course) {
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID : " + studentId);
        System.out.println("Course     : " + course);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student("Deepak", 21, "deepak@example.com", 101, "Computer Science");

        System.out.println("STUDENT DETAILS USING SINGLE INHERITANCE");
        System.out.println("=========================================");
        student.displayStudentDetails();
    }
}

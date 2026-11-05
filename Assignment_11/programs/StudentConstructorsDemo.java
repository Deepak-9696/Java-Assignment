class Student {
    private int studentId;
    private String studentName;
    private String course;
    private int age;

    Student() {
        studentId = 0;
        studentName = "Not Assigned";
        course = "Not Assigned";
        age = 0;
    }

    Student(int studentId, String studentName, String course, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Age          : " + age);
        System.out.println();
    }
}

public class StudentConstructorsDemo {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student parameterizedStudent = new Student(101, "Deepak", "Computer Science", 21);

        System.out.println("DEFAULT CONSTRUCTOR");
        System.out.println("-------------------");
        defaultStudent.displayDetails();

        System.out.println("PARAMETERIZED CONSTRUCTOR");
        System.out.println("-------------------------");
        parameterizedStudent.displayDetails();
    }
}

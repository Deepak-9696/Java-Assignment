class Employee {
    private int employeeId;
    private String name;
    private String designation;
    private double salary;

    Employee() {
        employeeId = 0;
        name = "Not Assigned";
        designation = "Not Assigned";
        salary = 0.0;
    }

    Employee(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee other) {
        this.employeeId = other.employeeId;
        this.name = other.name;
        this.designation = other.designation;
        this.salary = other.salary;
    }

    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.printf("Salary      : %.2f%n%n", salary);
    }
}

public class EmployeeConstructorsDemo {
    public static void main(String[] args) {
        Employee defaultEmployee = new Employee();
        Employee parameterizedEmployee = new Employee(501, "Deepak", "Software Developer", 65000.00);
        Employee copiedEmployee = new Employee(parameterizedEmployee);

        System.out.println("DEFAULT CONSTRUCTOR");
        System.out.println("-------------------");
        defaultEmployee.displayDetails();

        System.out.println("PARAMETERIZED CONSTRUCTOR");
        System.out.println("-------------------------");
        parameterizedEmployee.displayDetails();

        System.out.println("COPY CONSTRUCTOR");
        System.out.println("----------------");
        copiedEmployee.displayDetails();
    }
}

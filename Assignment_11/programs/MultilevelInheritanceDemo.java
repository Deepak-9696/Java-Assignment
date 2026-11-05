class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Employee {
    protected String department;
    protected int teamSize;

    Manager(int employeeId, String employeeName, double basicSalary, String department, int teamSize) {
        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.teamSize = teamSize;
    }
}

class ProjectManager extends Manager {
    private String projectName;
    private int projectDuration;

    ProjectManager(int employeeId, String employeeName, double basicSalary, String department, int teamSize, String projectName, int projectDuration) {
        super(employeeId, employeeName, basicSalary, department, teamSize);
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    void displayDetails() {
        System.out.println("Employee ID       : " + employeeId);
        System.out.println("Employee Name     : " + employeeName);
        System.out.printf("Basic Salary      : %.2f%n", basicSalary);
        System.out.println("Department        : " + department);
        System.out.println("Team Size         : " + teamSize);
        System.out.println("Project Name      : " + projectName);
        System.out.println("Project Duration  : " + projectDuration + " months");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager(701, "Deepak", 85000.00, "Technology", 8, "Campus Management System", 12);

        System.out.println("PROJECT MANAGER DETAILS USING MULTILEVEL INHERITANCE");
        System.out.println("=====================================================");
        manager.displayDetails();
    }
}

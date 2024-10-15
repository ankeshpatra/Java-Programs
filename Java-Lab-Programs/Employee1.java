import java.util.Scanner;
class Employee1 {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee1(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            empSalary += empSalary * percent / 100;
        } else {
            System.out.println("Invalid percentage!");
        }
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter the employee name: ");
        String empName = scanner.next();
        System.out.print("Enter the employee salary: ");
        double empSalary = scanner.nextDouble();
        Employee1 employee = new Employee1(empId, empName, empSalary);
        System.out.println("Before raise:");
        employee.display();
        System.out.println("Enter the percentage to raise the salary:");
        double percent = scanner.nextDouble();
        employee.raiseSalary(percent);
        System.out.println("After " + percent + "%raise:");
        employee.display();
        scanner.close();
    }
}
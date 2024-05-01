import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Employee Management System!");
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    viewEmployees();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
    
    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        employees.add(new Employee(name, age, salary));
        System.out.println("Employee added successfully!");
        scanner.close();
    }
    
    public static void removeEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name to remove:");
        String nameToRemove = scanner.nextLine();
        for (Employee emp : employees) {
            if (emp.getName().equals(nameToRemove)) {
                employees.remove(emp);
                System.out.println("Employee removed successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
        scanner.close();
    }
    
    public static void viewEmployees() {
        System.out.println("List of Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: $" + salary;
    }
}

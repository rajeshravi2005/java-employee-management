import java.util.*;
import java.util.stream.*;

public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public EmployeeService(Scanner sc) {
        this.sc = sc;
    }

    public void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();

        employees.put(id, new Employee(id, name, position));
        System.out.println("✅ Employee added successfully!");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("📋 Employee List (Sorted by ID):");
        employees.values().stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .forEach(System.out::println);
    }

    public void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear newline

        Employee emp = employees.get(id);
        if (emp != null) {
            System.out.println("Choose field to update:");
            System.out.println("1. Name");
            System.out.println("2. Position");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline again

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter new name: ");
                    emp.setName(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter new position: ");
                    emp.setPosition(sc.nextLine());
                }
                default -> System.out.println("Invalid option.");
            }

            System.out.println("✅ Employee updated.");
        } else {
            System.out.println("❌ Employee not found.");
        }
    }

    public void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        if (employees.remove(id) != null) {
            System.out.println("✅ Employee deleted successfully!");
        } else {
            System.out.println("❌ Employee not found.");
        }
    }
}

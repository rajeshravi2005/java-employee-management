import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 👈 only ONE Scanner here

        // ✅ Pass this scanner to the EmployeeService constructor
        EmployeeService service = new EmployeeService(sc);

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.addEmployee();
                case 2 -> service.viewEmployees();
                case 3 -> service.updateEmployee();
                case 4 -> service.deleteEmployee();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

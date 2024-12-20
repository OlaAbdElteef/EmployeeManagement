package prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        // Create an original Employee
        Employee originalEmployee = new Employee("John Doe", "Full-Time", 30, 50000);
        System.out.println("Original Employee:");
        originalEmployee.showDetails();

        // Clone the original Employee
        Employee clonedEmployee = (Employee) originalEmployee.clone();
        System.out.println("\nCloned Employee:");
        clonedEmployee.showDetails();

        // Modify the cloned Employee (optional)
        System.out.println("\nAfter Modifying Cloned Employee:");
        clonedEmployee = new Employee("Jane Smith", "Contractor", 28, 30000);
        clonedEmployee.showDetails();
    }
}

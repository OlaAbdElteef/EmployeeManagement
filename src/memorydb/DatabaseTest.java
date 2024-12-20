package memorydb;

public class DatabaseTest {
    public static void main(String[] args) {
        // Get the singleton instance
        DatabaseConnectionManager db = DatabaseConnectionManager.getInstance();

        // Perform CRUD operations
        db.addEmployee(101, "John Doe");
        db.addEmployee(102, "Jane Smith");

        System.out.println("Get Employee: " + db.getEmployee(101));
        System.out.println("Get Employee: " + db.getEmployee(103));

        db.updateEmployee(102, "Jane Doe");
        System.out.println("Get Updated Employee: " + db.getEmployee(102));

        db.deleteEmployee(101);
        System.out.println("Get Deleted Employee: " + db.getEmployee(101));
    }
}

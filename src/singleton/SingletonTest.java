package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // Testing Payroll System Singleton
        PayrollSystem payroll1 = PayrollSystem.getInstance();
        PayrollSystem payroll2 = PayrollSystem.getInstance();

        payroll1.processPayroll();

        // Verify if both instances are the same
        System.out.println("Payroll Instances Same? " + (payroll1 == payroll2));

        // Testing Database Connection Singleton
        DatabaseConnection db1 = DatabaseConnection.getConnection();
        DatabaseConnection db2 = DatabaseConnection.getConnection();

        // Adding employees
        db1.addEmployee(101, "John Doe");
        db1.addEmployee(102, "Jane Smith");

        // Querying employees
        System.out.println("Get Employee 101: " + db1.getEmployee(101));
        System.out.println("Get Employee 102: " + db2.getEmployee(102)); // Same instance

        // Updating an employee
        db2.updateEmployee(101, "Johnathan Doe");
        System.out.println("Updated Employee 101: " + db1.getEmployee(101));

        // Deleting an employee
        db1.deleteEmployee(102);
        System.out.println("Get Deleted Employee 102: " + db2.getEmployee(102));

        // Verify if both instances are the same
        System.out.println("Database Connections Same? " + (db1 == db2));
    }
}



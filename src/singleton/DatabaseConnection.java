package singleton;

import memorydb.DatabaseConnectionManager;

public class DatabaseConnection {
    // Step 1: Private static instance
    private static DatabaseConnection connection;

    // Step 2: Private constructor
    private DatabaseConnection() {
        System.out.println("Database Connection Established...");
    }

    // Step 3: Public method to get the instance
    public static synchronized DatabaseConnection getConnection() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }

    // Method to interact with the in-memory database
    public void addEmployee(int id, String name) {
        DatabaseConnectionManager.getInstance().addEmployee(id, name);
    }

    public String getEmployee(int id) {
        return DatabaseConnectionManager.getInstance().getEmployee(id);
    }

    public void updateEmployee(int id, String newName) {
        DatabaseConnectionManager.getInstance().updateEmployee(id, newName);
    }

    public void deleteEmployee(int id) {
        DatabaseConnectionManager.getInstance().deleteEmployee(id);
    }
}

package memorydb;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConnectionManager {
    // Step 1: Private static instance
    private static DatabaseConnectionManager instance;

    // Step 2: In-memory storage using HashMap
    private final Map<Integer, String> employeeDatabase;

    // Step 3: Private constructor
    private DatabaseConnectionManager() {
        employeeDatabase = new HashMap<>();
        System.out.println("In-memory Database Initialized...");
    }

    // Step 4: Public method to get the instance
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Step 5: CRUD Operations
    public void addEmployee(int id, String name) {
        employeeDatabase.put(id, name);
        System.out.println("Employee added: ID=" + id + ", Name=" + name);
    }

    public String getEmployee(int id) {
        return employeeDatabase.getOrDefault(id, "Employee not found");
    }

    public void updateEmployee(int id, String newName) {
        if (employeeDatabase.containsKey(id)) {
            employeeDatabase.put(id, newName);
            System.out.println("Employee updated: ID=" + id + ", New Name=" + newName);
        } else {
            System.out.println("Employee not found: ID=" + id);
        }
    }

    public void deleteEmployee(int id) {
        if (employeeDatabase.containsKey(id)) {
            employeeDatabase.remove(id);
            System.out.println("Employee removed: ID=" + id);
        } else {
            System.out.println("Employee not found: ID=" + id);
        }
    }
}

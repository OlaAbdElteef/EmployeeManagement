package singleton;

public class PayrollSystem {
    // Step 1: Private static instance
    private static PayrollSystem instance;

    // Step 2: Private constructor to prevent instantiation
    private PayrollSystem() {
        System.out.println("Payroll System Initialized...");
    }

    // Step 3: Public method to get the instance
    public static PayrollSystem getInstance() {
        if (instance == null) {
            instance = new PayrollSystem();
        }
        return instance;
    }

    // Method to process payroll
    public void processPayroll() {
        System.out.println("Processing Payroll for Employees...");
    }
}

package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        // External Employee data (incompatible format)
        ExternalEmployee externalEmployee = new ExternalEmployee("Alice Johnson", "Contractor");

        System.out.println("Direct External Employee Data:");
        externalEmployee.displayInfo();

        System.out.println("\nUsing Adapter to integrate with Employee Interface:");
        // Using Adapter to integrate with Employee Interface
        Employee adaptedEmployee = new ExternalEmployeeAdapter(externalEmployee);
        adaptedEmployee.showEmployeeDetails();
    }
}

package builder;

public class BuilderTest {
    public static void main(String[] args) {
        // Build a Full-Time Employee with all details
        Employee fullTimeEmployee = new Employee.EmployeeBuilder("John Doe", "Full-Time")
                .setAge(30)
                .setSalary(50000)
                .setDepartment("Finance")
                .build();

        // Build a Part-Time Employee with minimal details
        Employee partTimeEmployee = new Employee.EmployeeBuilder("Jane Smith", "Part-Time")
                .setAge(25)
                .build();

        // Build a Contractor with some details
        Employee contractor = new Employee.EmployeeBuilder("Mike Johnson", "Contractor")
                .setDepartment("IT")
                .build();

        // Display the Employee details
        System.out.println("Full-Time Employee:");
        fullTimeEmployee.showEmployeeDetails();

        System.out.println("\nPart-Time Employee:");
        partTimeEmployee.showEmployeeDetails();

        System.out.println("\nContractor:");
        contractor.showEmployeeDetails();
    }
}


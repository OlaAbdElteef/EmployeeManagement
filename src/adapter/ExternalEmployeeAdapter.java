package adapter;

// Adapter Class
public class ExternalEmployeeAdapter implements Employee {
    //Create a private reference
    private ExternalEmployee externalEmployee;

    //Create a constructor that take a reference 
    public ExternalEmployeeAdapter(ExternalEmployee externalEmployee) {
        this.externalEmployee = externalEmployee;
    }

    @Override
    public void showEmployeeDetails() {
        // Adapting the ExternalEmployee's data to match our Employee interface
        System.out.println("Adapted Employee Details:");
        System.out.println("Name: " + externalEmployee.getFullName());
        System.out.println("Type: " + externalEmployee.getJobType());
    }
}


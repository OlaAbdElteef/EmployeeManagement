package factory;

public class FinanceDepartment implements Department {
    @Override
    public void displayDepartmentInfo() {
        System.out.println("Finance Department: Manages company finances and budgets.");
    }
}


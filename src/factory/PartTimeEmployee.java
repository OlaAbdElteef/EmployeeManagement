package factory;

public class PartTimeEmployee implements Employee {
    @Override
    public void showEmployeeDetails() {
        System.out.println("Part-Time Employee: Hourly wages, Limited benefits.");
    }
}


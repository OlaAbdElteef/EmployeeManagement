package factory;

public class FullTimeEmployee implements Employee {
    @Override
    public void showEmployeeDetails() {
        System.out.println("Full-Time Employee: Benefits included, Fixed salary.");
    }
}

package factory;

public class Contractor implements Employee {
    @Override
    public void showEmployeeDetails() {
        System.out.println("Contractor: Short-term contract, No benefits.");
    }
}

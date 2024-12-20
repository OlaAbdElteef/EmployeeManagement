package factory;

public class FactoryTest {
    public static void main(String[] args) {
        // Test Employee Factory
        System.out.println("Testing Employee Factory:");
        Employee fullTime = EmployeeFactory.createEmployee("fulltime");
        Employee partTime = EmployeeFactory.createEmployee("parttime");
        Employee contractor = EmployeeFactory.createEmployee("contractor");

        fullTime.showEmployeeDetails();
        partTime.showEmployeeDetails();
        contractor.showEmployeeDetails();

        System.out.println("\nTesting Department Factory:");
        // Test Department Factory
        Department hr = DepartmentFactory.createDepartment("hr");
        Department finance = DepartmentFactory.createDepartment("finance");
        Department it = DepartmentFactory.createDepartment("it");

        hr.displayDepartmentInfo();
        finance.displayDepartmentInfo();
        it.displayDepartmentInfo();
    }
}

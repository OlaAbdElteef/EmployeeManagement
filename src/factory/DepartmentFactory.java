package factory;

public class DepartmentFactory {
    // Factory Method to create Department objects
    public static Department createDepartment(String departmentName) {
        if (departmentName == null) {
            return null;
        }
        switch (departmentName.toLowerCase()) {
            case "hr":
                return new HRDepartment();
            case "finance":
                return new FinanceDepartment();
            case "it":
                return new ITDepartment();
            default:
                throw new IllegalArgumentException("Unknown Department: " + departmentName);
        }
    }
}

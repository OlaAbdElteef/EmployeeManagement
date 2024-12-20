package factory;

public class EmployeeFactory {
    // Factory Method to create Employee objects
    public static Employee createEmployee(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee();
            case "parttime":
                return new PartTimeEmployee();
            case "contractor":
                return new Contractor();
            default:
                throw new IllegalArgumentException("Unknown Employee Type: " + type);
        }
    }
}

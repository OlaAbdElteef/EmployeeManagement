package builder;

public class Employee {
    // Required attributes
    private final String name;
    private final String type;

    // Optional attributes
    private int age;
    private double salary;
    private String department;

    // Private constructor (only Builder can call this)
    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.salary = builder.salary;
        this.department = builder.department;
    }

    // Display Employee details
    public void showEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        if (age != 0) System.out.println("Age: " + age);
        if (salary != 0) System.out.println("Salary: " + salary);
        if (department != null) System.out.println("Department: " + department);
    }

    // Static inner Builder class
    public static class EmployeeBuilder {
        private final String name;  // Required
        private final String type;  // Required
        private int age;            // Optional
        private double salary;      // Optional
        private String department;  // Optional

        // Constructor for required fields
        public EmployeeBuilder(String name, String type) {
            this.name = name;
            this.type = type;
        }

        // Methods for optional fields
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        // Build the final Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}

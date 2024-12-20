package prototype;

public class Employee implements Prototype {
    private String name;
    private String type;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, String type, int age, double salary) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.salary = salary;
    }

    // Clone method
    @Override
    public Prototype clone() {
        System.out.println("Cloning Employee...");
        return new Employee(this.name, this.type, this.age, this.salary);
    }

    // Display Employee details
    public void showDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

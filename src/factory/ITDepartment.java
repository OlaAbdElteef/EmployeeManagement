package factory;

public class ITDepartment implements Department {
    @Override
    public void displayDepartmentInfo() {
        System.out.println("IT Department: Manages technical infrastructure and software systems.");
    }
}


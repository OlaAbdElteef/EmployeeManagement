package factory;

public class HRDepartment implements Department {
    @Override
    public void displayDepartmentInfo() {
        System.out.println("HR Department: Responsible for recruitment, payroll, and employee relations.");
    }
}

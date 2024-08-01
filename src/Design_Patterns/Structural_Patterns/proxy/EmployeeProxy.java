package Design_Patterns.Structural_Patterns.proxy;

public class EmployeeProxy implements IEmployee {
    IEmployee employee;
    public EmployeeProxy() {
        employee=new Employee();
    }
    @Override
    public void create() {
        employee.create();

    }
}

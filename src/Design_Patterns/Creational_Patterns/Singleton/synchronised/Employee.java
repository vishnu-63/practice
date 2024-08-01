package Design_Patterns.Creational_Patterns.Singleton.synchronised;

public class Employee {
    private static  Employee employee;
    private Employee() {}
    public synchronized   static Employee createObject() {

        if(employee==null) {
            employee=new Employee();
        }
        return employee;
    }
}

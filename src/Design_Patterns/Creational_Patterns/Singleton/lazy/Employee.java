package Design_Patterns.Creational_Patterns.Singleton.lazy;

public class Employee {

    private static  Employee employee;
    private Employee() {}
    public static Employee createObject() {
        if(employee==null) {
            employee = new Employee();
        }
        return employee;
    }

}

package Design_Patterns.Creational_Patterns.Singleton.eager;

public class Employee {

    private static  Employee employee=new Employee();
    private Employee() {}
    public static Employee createObject() {
        return employee;
    }

}

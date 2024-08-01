package Design_Patterns.Creational_Patterns.Singleton.DoubleLocking;

public class Employee {

    private static  Employee employee;
    private Employee() {}
    public static Employee createObject() {
        if(employee==null) {
            synchronized (Employee.class) {
                if(employee==null) {
                    employee=new Employee();
                }
            }

        }
        return employee;
    }

}

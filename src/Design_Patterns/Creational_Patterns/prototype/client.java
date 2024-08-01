package Design_Patterns.Creational_Patterns.prototype;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(18,"vishnu",123);
        Student s2=(Student) s1.clone();
        System.out.println(s2);

    }
}

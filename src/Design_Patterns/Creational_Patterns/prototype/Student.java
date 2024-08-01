package Design_Patterns.Creational_Patterns.prototype;

public class Student  implements Cloneable {
    private int age;
    public String name;
    private int rollNo;
    public Student() {}

    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(age, name,rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


}

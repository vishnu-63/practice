package Design_Patterns.Creational_Patterns.builder;

import java.util.List;

public class Student {
    String name;
    int rollNumber;
    String fatherName;
    List<String> subjects;
    public Student(StudentBuilder builder) {
        this.rollNumber=builder.rollNumber;
        this.fatherName=builder.fatherName;
        this.name=builder.name;
        this.subjects=builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", fatherName='" + fatherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

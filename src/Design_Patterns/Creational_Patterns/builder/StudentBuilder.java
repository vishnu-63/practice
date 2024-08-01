package Design_Patterns.Creational_Patterns.builder;

import java.util.List;

public abstract class StudentBuilder{
    String name;
    int rollNumber;
    String fatherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber=rollNumber;
        return this;
    }

    public StudentBuilder setname(String name) {
        this.name=name;
        return this;
    }

    public StudentBuilder setfatherName(String fatherName) {
        this.fatherName=fatherName;
        return this;
    }

    abstract public StudentBuilder setSubjects();
    public Student build() {
        return new Student(this);
    }
}

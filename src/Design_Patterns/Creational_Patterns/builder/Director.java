package Design_Patterns.Creational_Patterns.builder;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent() {
        if(this.studentBuilder instanceof MbaBuilder) {
            return createMbaStudent();
        }
        if(this.studentBuilder instanceof EngineerBuilder) {
            return createEngineeringStudent();
        }
        return null;

    }

    private Student createEngineeringStudent() {
        return studentBuilder.setname("Vishnu").setfatherName("Kesav").setRollNumber(1).setSubjects().build();
    }

    private Student createMbaStudent() {
        return studentBuilder.setname("Vishnu").setfatherName("Kesav").setRollNumber(1).setSubjects().build();
    }

}

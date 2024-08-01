package Design_Patterns.Creational_Patterns.builder;

public class client {
    public static void main(String args[]) {
        Director directorObj1 = new Director(new EngineerBuilder());
        Director directorObj2 = new Director(new MbaBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();
        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}

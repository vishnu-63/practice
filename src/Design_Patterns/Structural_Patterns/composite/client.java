package Design_Patterns.Structural_Patterns.composite;

public class client {

    public static void main(String[] args) {
        Directory crime=new Directory("crime");
        File por=new File("por thozil");
        crime.add(por);

        Directory darkcomedy=new Directory("Dark Comedy");
        File doctor=new File("Doctor");
        darkcomedy.add(doctor);
        crime.add(darkcomedy);
        crime.ls();
    }
}

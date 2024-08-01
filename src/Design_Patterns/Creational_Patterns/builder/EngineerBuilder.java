package Design_Patterns.Creational_Patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineerBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Data Structures And Algorithms");
        subs.add("Python");
        subs.add("Operating Systems");
        this.subjects = subs;

        return this;

    }
}

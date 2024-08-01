package Design_Patterns.Structural_Patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemsList;
    public Directory(String directoryName) {
        this.directoryName= directoryName;
        this.fileSystemsList=new ArrayList<>();
    }

    public  void add(FileSystem fileSystem) {
        fileSystemsList.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("Directory Name: " +  directoryName);
        for(FileSystem fileSystem:fileSystemsList) {
            fileSystem.ls();
        }

    }
}

package Design_Patterns.Structural_Patterns.composite;

public class File implements FileSystem{
    public String fileName;
    public File(String fileName) {
        this.fileName=fileName;
    }
    @Override
    public void ls() {
        System.out.println("File Name:"+this.fileName);
    }
}


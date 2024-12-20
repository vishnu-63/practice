package Java.Functional_Interface;

@FunctionalInterface
public interface Bird {
    void canFly();
    default  int getHeight() {
        return 5;
    }
    static  void printInfo() {
        System.out.println("Printing Information");
    }
    String toString();
}

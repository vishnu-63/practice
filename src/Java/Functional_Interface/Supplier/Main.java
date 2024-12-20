package Java.Functional_Interface.Supplier;

public class Main {
    /*
    returns Supplieer of the result Accepts No input parameter returns the result

    * */
    public static void main(String[] args) {
        Supplier<String> supplier=()->"This is data returns..";
        System.out.println(supplier.get());
    }
}

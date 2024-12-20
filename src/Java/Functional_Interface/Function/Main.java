package Java.Functional_Interface.Function;

public class Main {
    public static void main(String[] args) {

        /*
            Represents function that accepts arguments, process the data and returns the result
        */
        Function<Integer,String> function=(Integer value)->{
            String val=value.toString();
            return val;
        };
        System.out.println(function.apply(1000));
    }
}

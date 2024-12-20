package Java.Functional_Interface.Predicate;

public class Main {
    public static void main(String[] args) {
        /*
        Predicate represents a function that accepts an argument process the results and returns whether it's true or false
        */
        Predicate<Integer> predicate =(Integer value)->{
            if(value%2==0) return true;
            else return false;
        };
        boolean isEven=predicate.check(1000);
       System.out.println(isEven);
    }
}



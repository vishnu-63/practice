package Java.Functional_Interface.Lambda_Expression;

public class Main {
    public static void main(String[] args) {
        Bird bird =(String value)->{
            System.out.println("This is a lambda Expression"+value);
        };

        bird.canFly(" and  i am inside");

    }
}

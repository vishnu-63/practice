package Java.Functional_Interface.Consumer;

public class Main {
    public static void main(String[] args) {

        /*.
        Consumer represents a method that accepts a parameter and returns no result
         */
        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Integer Value..."+integer);
            }
        };
        consumer.accept(1000);
    }
}

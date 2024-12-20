package Java.Functional_Interface;

public class practice {
    public static void main(String[] args) {

        //first alternate
        Bird bird1 =new Bird() {
            @Override
            public void canFly() {
                System.out.println("Yes,It Is..");
            }
        };

        Bird bird2 =()->{System.out.println("Yes,It Is..");};
    }
}

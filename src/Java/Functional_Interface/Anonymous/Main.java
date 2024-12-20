package Java.Functional_Interface.Anonymous;

public class Main {
    public static void main(String[] args) {
        Bird bird =new Bird(){
            @Override
            public void canFly(String val){
                System.out.println("Using Anonymous Class");
            }

        };

        
    }
}

package Design_Patterns.Creational_Patterns.Factory;


public class client {
    public static void main(String[] args) {
        Factory factory=new Factory();
        shape circle=factory.getShapeInstance("circle");
        shape rectangle=factory.getShapeInstance("rectangle");
        shape square=factory.getShapeInstance("square");
        rectangle.area();
        square.area();
        circle.area();
    }
}

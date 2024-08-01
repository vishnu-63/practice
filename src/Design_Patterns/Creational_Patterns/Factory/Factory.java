package Design_Patterns.Creational_Patterns.Factory;

public class Factory {
    public shape getShapeInstance(String shape) {
        if(shape.equals("rectangle")) {
            return new rectangle();
        }
        else if(shape.equals("square")) {
            return new square();
        }
        else if (shape.equals("circle")) {
            return new circle();
        }
        return null;
    }
}

package Design_Patterns.Structural_Patterns.Decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza  = new TomatoSauce(new Cheese(new BasePizza()));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
}

package Design_Patterns.Structural_Patterns.Decorator;

public class Cheese extends ToppingDecorator{
    public Cheese(Pizza newpizza) {
        super(newpizza);
    }
    @Override
    public String getDescription() {
        return basePizza.getDescription()+"\nAdding Cheese..";
    }

    @Override
    public double getCost() {
        return basePizza.getCost()+30;
    }
}

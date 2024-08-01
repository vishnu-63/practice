package Design_Patterns.Structural_Patterns.Decorator;
public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza newpizza) {
        super(newpizza);

    }
    @Override
    public String getDescription() {
        return basePizza.getDescription()+" Adding Sauce..";
    }
    @Override
    public double getCost() {
        return basePizza.getCost()+10;
    }
}


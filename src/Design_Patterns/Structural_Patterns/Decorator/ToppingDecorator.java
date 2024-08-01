package Design_Patterns.Structural_Patterns.Decorator;

abstract class ToppingDecorator implements Pizza {
    protected Pizza basePizza;
    public ToppingDecorator(Pizza newpizza) {
        basePizza=newpizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription();
    }

    @Override
    public double getCost() {
        return basePizza.getCost();
    }
}

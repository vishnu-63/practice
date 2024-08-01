package Design_Patterns.Structural_Patterns.Decorator;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}

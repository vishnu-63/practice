package Design_Patterns.Structural_Patterns.Decorator;
public class ThreeCheesePizza extends BasePizza{
    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;
    public void setDescription(String newDescription) {
        description = newDescription;
    }
    public String getDescription() {
        return description;
    }
    public void setCost(double newCost) {
        cost = newCost;
    }
    public double getCost() {
        return cost;
    }
}
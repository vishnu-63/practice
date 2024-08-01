package Design_Patterns.Structural_Patterns.Adapter;

public class WeightAdaptee {
    public double weight;
    public WeightAdaptee(double weight){this.weight=weight;}
    public double weightInPounds() {
        return this.weight;
    }
}

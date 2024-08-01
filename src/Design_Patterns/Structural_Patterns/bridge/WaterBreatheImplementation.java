package Design_Patterns.Structural_Patterns.bridge;

public class WaterBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe Through Gills..");
        System.out.println("Absorb Oxygen Through Water..");
        System.out.println("Release Carbon Dioxide..");
    }
}

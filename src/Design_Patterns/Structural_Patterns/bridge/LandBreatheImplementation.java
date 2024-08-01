package Design_Patterns.Structural_Patterns.bridge;

public class LandBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe Through Nose..");
        System.out.println("Exchange of co2 and O2..");
    }
}

package Design_Patterns.Structural_Patterns.bridge;

public class TreeBreatheImplementation implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathe Through Leaves..");
        System.out.println("Inhale Carbon Dioxide..");
        System.out.println("Exhale Oxygen..");

    }
}

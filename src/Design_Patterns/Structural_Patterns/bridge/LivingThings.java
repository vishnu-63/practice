package Design_Patterns.Structural_Patterns.bridge;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor=breatheImplementor;
    }
    public abstract void breatheprocess();
}

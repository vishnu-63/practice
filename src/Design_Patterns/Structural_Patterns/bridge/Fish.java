package Design_Patterns.Structural_Patterns.bridge;

public class Fish extends LivingThings{

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
    @Override
    public void breatheprocess() {
        breatheImplementor.breathe();
    }
}

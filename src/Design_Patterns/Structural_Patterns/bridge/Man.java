package Design_Patterns.Structural_Patterns.bridge;

public class  Man extends LivingThings{

    public Man(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheprocess() {
        breatheImplementor.breathe();
    }

}

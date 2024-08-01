package Design_Patterns.Structural_Patterns.bridge;

public class Tree extends LivingThings{

    public Tree(BreatheImplementor breatheImplementor) {
            super(breatheImplementor);
    }
    @Override
    public void breatheprocess() {
        breatheImplementor.breathe();
    }
}

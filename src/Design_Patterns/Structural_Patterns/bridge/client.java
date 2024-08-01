package Design_Patterns.Structural_Patterns.bridge;

//Bridge Pattern Decouples an abstraction from its implementation so that two can vary independently
public class client {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreatheImplementation());
        fish.breatheprocess();
        System.out.println();
        LivingThings human = new Man(new LandBreatheImplementation());
        human.breatheprocess();
        System.out.println();
        LivingThings tree = new Tree(new TreeBreatheImplementation());
        tree.breatheprocess();
    }
}

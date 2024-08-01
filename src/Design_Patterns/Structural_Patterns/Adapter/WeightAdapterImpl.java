package Design_Patterns.Structural_Patterns.Adapter;

public class WeightAdapterImpl implements WeightAdapter{
     WeightAdaptee weightMachine;
    public WeightAdapterImpl(WeightAdaptee weightMachine) {
        this.weightMachine=weightMachine;
    }

    @Override
    public double weightToKgs() {

        double weightInPound = this.weightMachine.weightInPounds();
        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}

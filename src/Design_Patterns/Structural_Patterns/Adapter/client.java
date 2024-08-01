package Design_Patterns.Structural_Patterns.Adapter;

public class client {
    public static void main(String[] args) {
        WeightAdaptee weightAdaptee=new WeightAdaptee(10);
        WeightAdapter weightadapter=new WeightAdapterImpl(weightAdaptee);
        System.out.println(weightadapter.weightToKgs());
    }


}

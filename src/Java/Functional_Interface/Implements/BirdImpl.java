package Java.Functional_Interface.Implements;

public class BirdImpl implements Bird{
    @Override
    public void canFly(String val) {
        System.out.println("Value.."+val);
    }
}

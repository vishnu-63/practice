package Design_Patterns.Structural_Patterns.Facade;

public class SoftwareCheck {
    OSCheck osCheck;
    DriverCheck driverCheck;

    public SoftwareCheck() {
        this.osCheck=new OSCheck();
        this.driverCheck=new DriverCheck();
    }
    boolean checkSoftwareOnBoot() {
        System.out.println("Software is in Good Condition..");
        return osCheck.osCheckOnBoot() &&  driverCheck.driverCheckOnBoot();
    }
}
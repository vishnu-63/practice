package Design_Patterns.Structural_Patterns.Facade;

public class LaptopOnSwitch {
    HardwareCheck hardwareCheck;
    SoftwareCheck softwareCheck;
    public LaptopOnSwitch() {
        this.hardwareCheck=new HardwareCheck();
        this.softwareCheck=new SoftwareCheck();
    }
    void switchOnLaptop() {
        if(hardwareCheck.checkHardwareOnBoot() && softwareCheck.checkSoftwareOnBoot() ) {
            System.out.println("Switching On Laptop.....");
        }
    }
}

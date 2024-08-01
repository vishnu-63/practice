package Design_Patterns.Structural_Patterns.Facade;

public class HardwareCheck {

    RAM ram;
    ROM rom;
    MotherBoard motherBoard;

    public HardwareCheck() {
        this.ram=new RAM();
        this.rom=new ROM();
        this.motherBoard=new MotherBoard();
    }

    boolean checkHardwareOnBoot() {
        System.out.println("Hardware is in Good Condition..");
        return ram.checkRamOnBoot() && rom.checkeRomOnBoot() && motherBoard.checkMotherBoardOnBoot() ;
    }


}

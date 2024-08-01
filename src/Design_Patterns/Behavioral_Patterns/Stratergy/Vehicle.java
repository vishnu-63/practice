package Design_Patterns.Behavioral_Patterns.Stratergy;

import Design_Patterns.Behavioral_Patterns.Stratergy.Drive_Statergy.DriveStratergy;

public class Vehicle {
    DriveStratergy driveObj;
    Vehicle(DriveStratergy driveObj){
        this.driveObj=driveObj;
    }
    public void drive(){
        driveObj.drive();
    }
}

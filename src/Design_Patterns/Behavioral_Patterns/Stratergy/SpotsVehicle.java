package Design_Patterns.Behavioral_Patterns.Stratergy;

import Design_Patterns.Behavioral_Patterns.Stratergy.Drive_Statergy.DriveStratergy;
import Design_Patterns.Behavioral_Patterns.Stratergy.Drive_Statergy.SportDrivingStratergy;

public class SpotsVehicle extends Vehicle{
    SpotsVehicle() {
        super(new SportDrivingStratergy());
    }
}

package Design_Patterns.Behavioral_Patterns.Stratergy;

import Design_Patterns.Behavioral_Patterns.Stratergy.Drive_Statergy.DriveStratergy;
import Design_Patterns.Behavioral_Patterns.Stratergy.Drive_Statergy.NormalDriveStratergy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStratergy());
    }
}

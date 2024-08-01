package E_Commerce.Repository;

import E_Commerce.Model.PaymentMode;
import E_Commerce.Model.PincodeServicalbility;

import java.util.HashMap;

public class PincodeServicabilityRepository {
    // Source  -> ( dest, paymentMode)
    HashMap<String, HashMap<String, PaymentMode>> pinCodes;

    public PincodeServicabilityRepository(){
        pinCodes = new HashMap<>();
    }

    public Boolean createPinCodeServiceability(String sourcePinCode, PincodeServicalbility pinCodeServiceability){
        if(pinCodes.get(sourcePinCode)==null){
            HashMap<String, PaymentMode> destinationCode = new HashMap<>();
            destinationCode.put(pinCodeServiceability.getDestinationPinCode(), pinCodeServiceability.getPaymentMode());
            pinCodes.put(sourcePinCode,destinationCode);
        }
        pinCodes.get(sourcePinCode).put(pinCodeServiceability.getDestinationPinCode(), pinCodeServiceability.getPaymentMode());

        return true;
    }

    public HashMap<String, PaymentMode> getAllDestinationPincodes(String sourcePinCode){
        return pinCodes.get(sourcePinCode);
    }
}


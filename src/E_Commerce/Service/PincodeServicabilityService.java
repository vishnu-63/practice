package E_Commerce.Service;

import E_Commerce.Model.PaymentMode;
import E_Commerce.Model.PincodeServicalbility;
import E_Commerce.Repository.PincodeServicabilityRepository;

import java.util.HashMap;

public class PincodeServicabilityService {

    PincodeServicabilityRepository pincodeServiceabilityRepository;

    public PincodeServicabilityService(PincodeServicabilityRepository pincodeServiceabilityRepository){
        this.pincodeServiceabilityRepository = pincodeServiceabilityRepository;
    }



    public Boolean createPinCodeServiceability(String sourcePinCode, String destinationPinCode, PaymentMode paymentMode) throws Exception {
        PincodeServicalbility pinCodeServiceability = new PincodeServicalbility(destinationPinCode,paymentMode);
        return pincodeServiceabilityRepository.createPinCodeServiceability(sourcePinCode,pinCodeServiceability);

    }


    public Boolean checkIsSourceAndDestPinCodeMatchesForPaymentType(String sourcePinCode, String destinationPinCode, PaymentMode paymentMode) throws Exception {
        HashMap<String, PaymentMode> allDestinationPincodes = pincodeServiceabilityRepository.getAllDestinationPincodes(sourcePinCode);
        return allDestinationPincodes.containsKey(destinationPinCode) &&
                paymentMode.equals(allDestinationPincodes.get(destinationPinCode));
    }
}

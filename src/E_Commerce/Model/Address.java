package E_Commerce.Model;

import Design_Patterns.Behavioral_Patterns.Template.PaymentFlow;

public class Address {
    private final String Street;
    private final String city;
    private final String state;
    private final String pincode;



    public Address(String street, String city, String state, String pincode) {
        Street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getStreet() {
        return Street;
    }



    public String getCity() {
        return city;
    }



    public String getState() {
        return state;
    }


    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

package Design_Patterns.Behavioral_Patterns.State_vendor_machine;

import Design_Patterns.Behavioral_Patterns.State_vendor_machine.VendingStates.State;
import Design_Patterns.Behavioral_Patterns.State_vendor_machine.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    List<Coin> coinsList;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();;
        this.inventory = new Inventory(10);
        this.coinsList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinsList() {
        return coinsList;
    }

    public void setCoinsList(List<Coin> coinsList) {
        this.coinsList = coinsList;
    }
}

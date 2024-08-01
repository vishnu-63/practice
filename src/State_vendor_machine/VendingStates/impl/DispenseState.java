package State_vendor_machine.VendingStates.impl;

import State_vendor_machine.Coin;
import State_vendor_machine.Item;
import State_vendor_machine.VendingMachine;
import State_vendor_machine.VendingStates.State;

import java.awt.*;
import java.util.List;

public class DispenseState implements State {
    DispenseState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }
    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Cannot start Product selection  during Dispatch");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Cannot select Product during Dispatch");

    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Cannot click Insert Coin button during Dispatch");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot  Insert Coin button during Dispatch");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
       System.out.println("Dispensing The Product");
       Item item =machine.getInventory().getItem(codeNumber);
       machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Cannot Get Change during Dispatch");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Cannot Refund Full Money during Dispatch");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Cannot Update Inventory button during Dispatch");

    }
}

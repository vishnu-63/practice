package Design_Patterns.Behavioral_Patterns.State_vendor_machine.VendingStates;

import Design_Patterns.Behavioral_Patterns.State_vendor_machine.Coin;
import Design_Patterns.Behavioral_Patterns.State_vendor_machine.Item;
import Design_Patterns.Behavioral_Patterns.State_vendor_machine.VendingMachine;

import java.util.List;

public interface State {
        public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
        public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

        public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

        public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

        public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

        public int getChange(int returnChangeMoney) throws Exception;


        public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

        public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


    }



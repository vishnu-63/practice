package Design_Patterns.Behavioral_Patterns.State_vendor_machine;

public class Item {

    public ItemType itemType;
    public int cost;

    public Item() {}
    public Item(ItemType itemType,int cost) {
        this.cost=cost;
        this.itemType=itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

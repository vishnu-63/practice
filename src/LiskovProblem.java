public class LiskovProblem {

    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public  MenuItem(int price,String name,String description) {
            this.description=description;
            this.name=name;
            this.price=price;
        }

        public double getPrice() {return this.price;}
    }

    public static class BeverageItems extends MenuItem{

        public BeverageItems(int price, String name, String description) {
            super(price, name, description);
        }
        public double getpricewithdiscount(int per) {
            return this.price-(per*0.01*this.price);
        }
    }

    public static  void printprice(MenuItem menuItem) {
        if(menuItem instanceof MenuItem) {
            menuItem.getPrice();

        } else if (menuItem instanceof BeverageItems) {
            ((BeverageItems)menuItem).getpricewithdiscount(10);
        }
    }

    public static void main(String[] args) {
        BeverageItems b=new BeverageItems(10,"Thums Up","Resistance");
        MenuItem menuItem=new MenuItem(30,"Kitkat","Waffer");
        printprice(b);
        printprice(menuItem);
    }
}
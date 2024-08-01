public class LiskovSolution {
        public static class MenuItem {
            public int price;
            public String name;
            public String description;

            public  MenuItem(int price,String name,String description) {
                this.description=description;
                this.name=name;
                this.price=price;
            }

            public double getPrice() {return this.price-this.getdiscount();}

            public double getdiscount() {
                return 0;
            }
        }

        public static class BeverageItems extends MenuItem{

            public BeverageItems(int price, String name, String description) {
                super(price, name, description);
            }
            public double getPrice() {return this.price-this.getdiscount();}

            public double getdiscount() {
                int per=10;
                return this.price*10*0.01;
            }
        }

        public static  void printprice(MenuItem menuItem) {
            System.out.println(menuItem.name+" " + menuItem.getPrice());
        }

        public static void main(String[] args) {
            BeverageItems b=new BeverageItems(10,"Thums Up","Resistance");
            MenuItem menuItem=new MenuItem(30,"Kitkat","Waffer");
            printprice(b);
            printprice(menuItem);
        }
    }


interface A{
    int age=44;
    String area="mumbai";
    void show();
    void configure();
}
class N implements A{


    @Override
    public void show() {
        System.out.println("in a show");


    }

    @Override
    public void configure() {
        // TODO Auto-generated method stub
        System.out.println("in a configure");
    }
}


public class interface1 {
    public static void main(String[] args) {
        A obj = new N();
        obj.show();
        obj.configure();
        System.out.println(A.area);
    }
}

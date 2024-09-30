package Java;

public class Employee {
    public static void main(String[] args) {
        for(Days day:Days.values()) {
            System.out.println(day.ordinal()+" " +day.name());
        }
        System.out.println(Days.valueOf("FRIDAY"));
    }
}

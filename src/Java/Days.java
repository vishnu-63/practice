package Java;

public enum Days implements MyInterface  {
    SUNDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Hello.. i am inside Sunday's Dummy Method ");
        }

    },
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    public void dummyMethod() {
        System.out.println("Hello.. it's normal Dummy Method");
    }
    @Override
    public String tolowerCase(){
      return this.name().toLowerCase();
    }
}

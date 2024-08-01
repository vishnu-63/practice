package Design_Patterns.Structural_Patterns.FlyWeight.Robot;


public class HumanoidRobot implements IRobot{
    private String name;
    private Sprites body;
    public HumanoidRobot(String name,Sprites body) {
        this.name=name;
        this.body=body;
    }

    public String getName() {
        return name;
    }
    public Sprites getBody() {
        return body;
    }
    @Override
    public void display(int x,int y) {
        System.out.println("Robot Is At "+x+","+y+" Position");
    }
}

package Design_Patterns.Behavioral_Patterns.MeMento;

public class Originator {
    int width;
    int height;
    public  Originator(int width,int height) {
        this.height=height;
        this.width=width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public Memento createMemento(){
        return new Memento(height,width);
    }
    public void restoreMemento(Memento mementoObj) {
        this.height=mementoObj.getHeight();
        this.width=mementoObj.getWidth();

    }
}

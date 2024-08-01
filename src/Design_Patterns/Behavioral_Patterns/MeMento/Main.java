package Design_Patterns.Behavioral_Patterns.MeMento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Originator originatorObj=new Originator(10,15);
        Memento snapshot1=originatorObj.createMemento();
        careTaker.addMemento(snapshot1);
        originatorObj.setHeight(20);
        originatorObj.setWidth(25);
        Memento snapshot2=originatorObj.createMemento();
        careTaker.addMemento(snapshot1);
        System.out.println(careTaker);
        Memento undo=careTaker.undo();
        originatorObj.restoreMemento(undo);
        System.out.println(originatorObj.height+","+originatorObj.width);
        //careTaker.addMemento();
    }
}

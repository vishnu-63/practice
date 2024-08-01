package Design_Patterns.Behavioral_Patterns.MeMento;

public class Memento {
    int width;
    int height;

    public Memento(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

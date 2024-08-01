package Design_Patterns.Structural_Patterns.FlyWeight.Text;

public class DocumentCharacter implements Iletter{

    private char c;
    private String fontType;
    private int fontSize;

    public DocumentCharacter(char c, String fontType, int fontSize) {
        this.c=c;
        this.fontType=fontType;
        this.fontSize=fontSize;
    }

    public char getC() {
        return c;
    }

    public String getFontType() {
        return fontType;
    }

    public int getFontSize() {
        return fontSize;
    }
    @Override
    public void display(int row, int column) {
        System.out.println("Letter "+c+" With Font Style "+fontType+" and "+fontSize+" At "+row+","+column+" Position..");
    }
}

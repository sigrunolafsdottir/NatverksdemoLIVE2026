package FirstDaysDemos.Skodemo;

public class Skor {

    protected int size;
    protected String type;
    protected String color;


    public Skor(int size, String type, String color) {
        this.size = size;
        this.type = type;
        this.color = color;
    }

    private int secretNumber(){
        return 9;
    }

    /*
    @Override
    public String toString(){
        return "skor med storlek "+size+" typ: "+type+" färg: "+color;
    }
*/

    public String sigrunsPrint(){
        return "SIgruns print: skor med storlek "+size+" typ: "+type+" färg: "+color;
    }

    public Skor() {
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {}
}

package FirstDaysDemos;

public class Pepparkaka {

    boolean gräddad;
    String form;

    public Pepparkaka() {}

    public Pepparkaka(boolean gräddad, String form){
        this.gräddad=gräddad;
        this.form=form;
    }


    public boolean isGräddad() {
        return gräddad;
    }

    public void setGräddad(boolean gräddad) {
        this.gräddad = gräddad;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void printMe(){
        IO.println("jag är en pepparkaka med formen "+form);
    }
}

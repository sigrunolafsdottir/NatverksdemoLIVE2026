package SecondDayDemo;

public class Student extends Person{

    private String kurs;

    public Student(String name, String ssn, String kurs) {
       super(name, ssn);
       this.kurs = kurs;
    }

    @Override
    public String getFavoriteSnack() {
        return "Chips med Dillsmak";
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }
}

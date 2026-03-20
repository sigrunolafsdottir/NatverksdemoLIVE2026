package SecondDayDemo.Greenest;

public class Cactus extends Plant  {

    public Cactus(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String feedMe() {
        return 0.02 + " mineralvatten";
    }

}

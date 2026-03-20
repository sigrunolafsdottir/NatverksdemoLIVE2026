package SecondDayDemo.Greenest;

public class CarnivorousPlant extends Plant  {

    public CarnivorousPlant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String feedMe() {
        return 0.1+0.2*height + " proteindryck";
    }
}

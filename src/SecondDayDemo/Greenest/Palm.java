package SecondDayDemo.Greenest;

public class Palm extends Plant {

    public Palm(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String feedMe(){
        return 0.5 * height + " kranvatten";
    }

}

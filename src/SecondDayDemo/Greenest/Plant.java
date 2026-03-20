package SecondDayDemo.Greenest;

public abstract class Plant  implements Feedable {

    protected String name;
    protected double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}

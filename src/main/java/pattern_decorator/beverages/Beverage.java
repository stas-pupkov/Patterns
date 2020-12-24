package pattern_decorator.beverages;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};
    String description = "Unknown beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

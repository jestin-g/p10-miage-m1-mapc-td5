package code;

public abstract class Extra implements Beverage {
    private Beverage component;

    public Extra(Beverage component) {
        this.component = component;
    }

    public double getPrice() {
        return extra(component.getPrice());
    }

    @Override
    public String toString() {
        return component.toString() + ", " + this.getClass().getSimpleName();
    }

    public abstract double extra(double price);
}

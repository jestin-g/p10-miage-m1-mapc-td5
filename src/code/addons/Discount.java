package code.addons;

import code.Beverage;
import code.Extra;

public class Discount extends Extra {
    public Discount(Beverage component) {
        super(component);
    }

    @Override
    public double extra(double price) {
        return price * 0.8;
    }
}

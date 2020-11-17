package code.addons;

import code.Beverage;
import code.Extra;

public class SoyMilk extends Extra {
    public SoyMilk(Beverage component) {
        super(component);
    }

    public double extra(double price) {
        return price + 1.25;
    }
}

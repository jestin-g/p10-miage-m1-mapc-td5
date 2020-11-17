package code.addons;

import code.Beverage;
import code.Extra;

public class ExpressoShot extends Extra {
    public ExpressoShot(Beverage component) {
        super(component);
    }

    @Override
    public double extra(double price) {
        return price + 0.8;
    }
}

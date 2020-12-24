package pattern_decorator.decorators;

import pattern_decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}

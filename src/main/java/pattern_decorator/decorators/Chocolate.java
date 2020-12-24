package pattern_decorator.decorators;

import pattern_decorator.beverages.Beverage;

public class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) cost += 0.10;
        else if (beverage.getSize() == Size.GRANDE) cost += 0.15;
        else if (beverage.getSize() == Size.VENTI) cost += 0.25;
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}

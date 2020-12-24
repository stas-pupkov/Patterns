package pattern_decorator;

import pattern_decorator.beverages.Beverage;
import pattern_decorator.beverages.Espresso;
import pattern_decorator.beverages.HouseBlend;
import pattern_decorator.decorators.Chocolate;
import pattern_decorator.decorators.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.Size.VENTI);
        houseBlend = new Chocolate(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}

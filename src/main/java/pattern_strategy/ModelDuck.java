package pattern_strategy;

import pattern_strategy.fly_behavior.FlyNoWay;
import pattern_strategy.quack_behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm model duck");
    }

}

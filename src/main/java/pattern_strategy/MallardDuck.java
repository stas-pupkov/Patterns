package pattern_strategy;

import pattern_strategy.fly_behavior.FlyWithWings;
import pattern_strategy.quack_behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm mallard duck");
    }

}

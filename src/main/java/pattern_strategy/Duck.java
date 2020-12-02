package pattern_strategy;

import pattern_strategy.fly_behavior.FlyBehaviour;
import pattern_strategy.quack_behavior.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehaviour flyBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

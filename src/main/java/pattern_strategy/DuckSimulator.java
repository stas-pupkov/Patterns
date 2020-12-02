package pattern_strategy;

import pattern_strategy.fly_behavior.FlyWithWings;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyWithWings());
        model.performFly();
    }
}

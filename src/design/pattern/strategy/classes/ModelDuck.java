package design.pattern.strategy.classes;

import design.pattern.strategy.impl.FlyNoWay;
import design.pattern.strategy.impl.MuteQuack;

/**
 * @Classname ModelDuck
 * @Description TODO
 * @Date 2021/3/12 10:08
 * @Created by ericlee
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck !");
    }
}

package design.pattern.strategy.classes;

import design.pattern.strategy.interfaces.FlyBehavior;
import design.pattern.strategy.interfaces.QuackBehavior;

/**
 * @Classname Strategy  策略模式
 * @Description TODO
 * @Date 2021/3/4 22:16
 * @Created by ericlee
 *
 *
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void  display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks can float !!!");
    }
}

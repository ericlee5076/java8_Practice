package design.pattern.strategy.impl;

import design.pattern.strategy.interfaces.FlyBehavior;

/**
 * @Classname FlyNoWay
 * @Description TODO
 * @Date 2021/3/12 9:54
 * @Created by ericlee
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}

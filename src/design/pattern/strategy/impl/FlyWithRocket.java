package design.pattern.strategy.impl;

import design.pattern.strategy.interfaces.FlyBehavior;

/**
 * @Classname FlyWithWings
 * @Description TODO
 * @Date 2021/3/12 9:53
 * @Created by ericlee
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with Rocket !!!");
    }
}

package design.pattern.strategy.impl;

import design.pattern.strategy.interfaces.QuackBehavior;

/**
 * @Classname Quack
 * @Description TODO
 * @Date 2021/3/12 9:56
 * @Created by ericlee
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱...");
    }
}

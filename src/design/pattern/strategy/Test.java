package design.pattern.strategy;

import design.pattern.strategy.classes.Duck;
import design.pattern.strategy.classes.ModelDuck;
import design.pattern.strategy.impl.FlyWithRocket;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/3/12 10:15
 * @Created by ericlee
 *
 * 策略模式
 * 定义多个算法并单独封装起来
 * 当前的多个算法指的是接口(flyBehavior和quackBehavior) .
 * 定义的接口作为父类(可以为普通类，也可以是抽象类)的属性.
 * 然后在父类中进行接口方法的调用，这样子类就拥有了父类中的方法；
 * 如果想在运行时动态修改对象的行为，那么应该在父类中，为各个接口属性添加set方法；
 */
public class Test {
    public static void main(String[] args) {
        //测试
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithRocket());
        duck.performFly();
    }
}

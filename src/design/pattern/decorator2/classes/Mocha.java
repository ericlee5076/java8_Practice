package design.pattern.decorator2.classes;

import design.pattern.decorator2.abstracts.Beverage;
import design.pattern.decorator2.abstracts.CondimentDecorator;

/**
 * @Classname Mocha
 * @Description TODO
 * @Date 2021/3/18 15:49
 * @Created by ericlee
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.20;
    }
}

package design.pattern.decorator1.classes;

import design.pattern.decorator1.abstracts.Beverage;
import design.pattern.decorator1.abstracts.CondimentDecorator;

/**
 * @Classname Whip
 * @Description 奶泡
 * @Date 2021/3/18 15:49
 * @Created by ericlee
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.39;
    }
}

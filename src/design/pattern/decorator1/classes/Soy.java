package design.pattern.decorator1.classes;

import design.pattern.decorator1.abstracts.Beverage;
import design.pattern.decorator1.abstracts.CondimentDecorator;

/**
 * @Classname Soy
 * @Description 豆浆
 * @Date 2021/3/18 15:49
 * @Created by ericlee
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.25;
    }
}

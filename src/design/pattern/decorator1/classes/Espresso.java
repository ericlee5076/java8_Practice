package design.pattern.decorator1.classes;

import design.pattern.decorator1.abstracts.Beverage;

/**
 * @Classname Espresso
 * @Description 浓缩咖啡(饮料)
 * @Date 2021/3/18 15:40
 * @Created by ericlee
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}

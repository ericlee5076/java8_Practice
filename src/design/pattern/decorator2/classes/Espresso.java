package design.pattern.decorator2.classes;

import design.pattern.decorator2.abstracts.Beverage;

/**
 * @Classname Espresso
 * @Description 浓缩咖啡(饮料)
 * @Date 2021/3/18 15:40
 * @Created by ericlee
 */
public class Espresso implements Beverage {

    public Espresso() {
        System.out.println("Espresso");
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}

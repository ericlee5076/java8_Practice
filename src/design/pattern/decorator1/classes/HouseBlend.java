package design.pattern.decorator1.classes;

import design.pattern.decorator1.abstracts.Beverage;

/**
 * @Classname Espresso
 * @Description 混合咖啡(饮料)
 * @Date 2021/3/18 15:40
 * @Created by ericlee
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public Double cost() {
        return 0.68;
    }
}

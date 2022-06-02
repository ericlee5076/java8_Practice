package design.pattern.decorator2.classes;

import design.pattern.decorator2.abstracts.Beverage;

/**
 * @Classname Espresso
 * @Description 混合咖啡(饮料)
 * @Date 2021/3/18 15:40
 * @Created by ericlee
 */
public class HouseBlend implements Beverage {

    public HouseBlend() {
        System.out.println("HouseBlend");
    }

    @Override
    public Double cost() {
        return 0.68;
    }
}

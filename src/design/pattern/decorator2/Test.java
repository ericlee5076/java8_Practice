package design.pattern.decorator2;

import design.pattern.decorator2.abstracts.Beverage;
import design.pattern.decorator2.classes.*;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/3/18 16:00
 * @Created by ericlee
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());

        Beverage beverage2 = new Mocha(new Mocha(new Espresso()));
        System.out.println(beverage2.cost());

        Beverage beverage3 = new Soy(new Whip(new Mocha(new HouseBlend())));
        System.out.println(beverage3.cost());
    }
}

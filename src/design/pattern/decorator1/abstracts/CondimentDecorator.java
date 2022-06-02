package design.pattern.decorator1.abstracts;

/**
 * @Classname Condiment
 * @Description 调料抽象类
 * @Date 2021/3/18 15:28
 * @Created by ericlee
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

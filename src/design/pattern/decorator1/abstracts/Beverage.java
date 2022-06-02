package design.pattern.decorator1.abstracts;

/**
 * @Classname Beverage
 * @Description 饮料抽象类
 * @Date 2021/3/18 15:20
 * @Created by ericlee
 */
public abstract class Beverage {
    protected String description = "";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}

package design.pattern.observer1.interfaces;

/**
 * @Classname Observer
 * @Description TODO
 * @Date 2021/3/14 18:09
 * @Created by ericlee
 */
public interface Observer {

    void update(Float temperature, Float pressure, Float humidity);
}

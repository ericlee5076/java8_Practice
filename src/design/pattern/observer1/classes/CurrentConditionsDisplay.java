package design.pattern.observer1.classes;

import design.pattern.observer1.interfaces.Observer;
import design.pattern.observer1.interfaces.Subject;

/**
 * @Classname CurrentConditionsDisplay
 * @Description TODO
 * @Date 2021/3/17 19:15
 * @Created by ericlee
 */
public class CurrentConditionsDisplay implements Observer {
    //温度
    private Float temperature;
    //气压
    private Float pressure;
    //湿度
    private Float humidity;

    /**
     * 用于取消注册等业务
     */
    private Subject weatherData;

    /**
     * 1：构造当前对象
     * 2：注册当前对象
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    /**
     * 当update被调用时，我们将温度、湿度、压力保存起来，以便在该类的其他函数中进行调用；
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }

    public void display(){
        System.out.println("Current conditions：" + temperature + "F degree and ：" + humidity + "%humidity.");
    }

    public void cancel(){
        weatherData.removeObserver(this);
    }
}

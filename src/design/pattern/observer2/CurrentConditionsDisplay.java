package design.pattern.observer2;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

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
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void cancel(){
        observable.deleteObserver(this);
    }

    /**
     * 采用的是“拉取”方式，所以参数arg没有用到！
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        //1：采用“拉取”的模式，可以由观察者自己决定需要获取什么数据；
        if(arg instanceof WeatherData){

            /*WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();

            display();*/
        }

        //2：采用“推送”的模式，每一个观察者获取的都是主题打包发送过来的数据；
        //可能有很多是自己不需要的数据；
        if(arg instanceof Map){
            Map map = (Map) arg;
            if(map.containsKey("temperature")){
                this.temperature = (Float) map.get("temperature");
            }
            if(map.containsKey("pressure")){
                this.pressure = (Float) map.get("pressure");
            }
            if(map.containsKey("humidity")){
                this.humidity = (Float) map.get("humidity");
            }
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions：" + temperature + "F degree and ：" + humidity + "%humidity.");
    }

}

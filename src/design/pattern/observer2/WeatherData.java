package design.pattern.observer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * @Classname WeatherData
 * @Description TODO
 * @Date 2021/3/14 18:13
 * @Created by ericlee
 */
public class WeatherData extends Observable {

    //温度
    private Float temperature;
    //气压
    private Float pressure;
    //湿度
    private Float humidity;

    public void setMeasurements(Float temperature, Float pressure, Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementsChanged();
    }

    /**
     * 这次采用的是"拉取"模式,所以调用的是无参数的notifyObservers()方法！
     */
    public void measurementsChanged(){
        setChanged();
        //采用“拉取”的模式
        //notifyObservers();

        //采用“推送”的模式
        Map map = new HashMap();
        map.put("temperature", temperature);
        map.put("pressure", pressure);
        map.put("humidity", humidity);
        notifyObservers(map);
    }

    /**
     * 采用"拉取"模式时，我们需要添加订阅主题各个属性的getter方法；
     * @return
     */
    /*public Float getTemperature() {
        return temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getHumidity() {
        return humidity;
    }*/
}

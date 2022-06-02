package design.pattern.observer1.classes;

import design.pattern.observer1.interfaces.Observer;
import design.pattern.observer1.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname WeatherData
 * @Description TODO
 * @Date 2021/3/14 18:13
 * @Created by ericlee
 */
public class WeatherData implements Subject {

    private  List<Observer> observerList = new ArrayList<>();

    //温度
    private Float temperature;
    //气压
    private Float pressure;
    //湿度
    private Float humidity;

    @Override
    public void registObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if(index >= 0){
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void setMeasurements(Float temperature, Float pressure, Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}

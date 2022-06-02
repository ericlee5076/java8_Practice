package design.pattern.observer2;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/3/17 21:39
 * @Created by ericlee
 */
public class Test {
    public static void main(String[] args) {

        //使用java自带的观察者模式的坏处：
        //1：首先Observable是一个普通的java类，而java是不支持多继承的，所以当该类还需要继承其他父类时，将无法实现；
        //2：
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1f, 2f, 3.5f);

        weatherData.setMeasurements(2f, 3f, 5.5f);
    }
}

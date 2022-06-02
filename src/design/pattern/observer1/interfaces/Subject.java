package design.pattern.observer1.interfaces;

/**
 * @Classname Subject
 * @Description TODO
 * @Date 2021/3/14 18:07
 * @Created by ericlee
 *
 * 主题
 *
 */
public interface Subject {
    void registObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

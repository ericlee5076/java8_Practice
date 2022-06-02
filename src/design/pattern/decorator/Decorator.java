package design.pattern.decorator;

/**
 * @Classname Decorator
 * @Description TODO
 * @Date 2021/3/4 21:49
 * @Created by ericlee
 */
public class Decorator {
    public static void main(String[] args) {
        //测试1
        Component component1 = new Camera();
        component1.operation();
        System.out.println("==================================================");
        //测试二
        Component component2 = new MeiYan(new Camera());
        component2.operation();
        System.out.println("==================================================");
        //测试二
        Component component3 = new LvJing(new MeiYan(new Camera()));
        component3.operation();
    }
}

interface Component {
    void operation();
}

class Camera implements Component{

    @Override
    public void operation() {
        System.out.println("拍照!!!");
    }
}


/**
 * 抽象类直接继承该接口，不需要实现；
 * 但是抽象类必须持有该接口类型的变量,并构造它；
 */
abstract class DecoratorClass implements Component{
    Component component;

    public DecoratorClass(Component component) {
        this.component = component;
    }
}

class MeiYan extends DecoratorClass{

    public MeiYan(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("美颜!!!");
    }
}

class LvJing extends DecoratorClass{

    public LvJing(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("添加滤镜!");
    }
}

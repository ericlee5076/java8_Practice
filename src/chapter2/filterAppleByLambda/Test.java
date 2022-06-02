package chapter2.filterAppleByLambda;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>(5);
        apples.add(new Apple("a","green",30));
        apples.add(new Apple("b","green",20));
        apples.add(new Apple("c","red",30));
        apples.add(new Apple("d","red",25));
        apples.add(new Apple("e","blue",50));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        /**/
        List<Apple> results1 = FilterUtil.filter(apples,(Apple p) -> p.getColor().equals("green"));
        for (Apple p : results1) {
            System.out.println(p);
        }

        System.out.println("====================================================");
        List<Integer> results2 = FilterUtil.filter(numbers,(Integer num) -> num >= 3);
        for (Integer n : results2) {
            System.out.println(n);
        }

        System.out.println("====================================================");
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o2.getWeight().compareTo(o1.getWeight());
            }
        });
        for (Apple p : apples) {
            System.out.println(p);
        }

        System.out.println("====================================================");
    }

}

class Apple{
    private String name;
    private String color;
    private Integer weight;

    public Apple(String name, String color, Integer weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

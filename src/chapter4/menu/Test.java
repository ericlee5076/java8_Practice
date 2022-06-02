package chapter4.menu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800, Dish.Type.Meat),
                new Dish("beef",false,700, Dish.Type.Meat),
                new Dish("chicken",false,400, Dish.Type.Meat),

                new Dish("french fires",true,530, Dish.Type.Other),
                new Dish("rice",true,350, Dish.Type.Other),
                new Dish("season",true,120, Dish.Type.Other),
                new Dish("pizza",true,550, Dish.Type.Other),

                new Dish("prawns",false,300, Dish.Type.Fish),
                new Dish("salmon",false,450, Dish.Type.Fish)
        );

        System.out.println(menu.size());
        Dish dish = menu.get(menu.size() - 1);
        menu.remove(dish);
        System.out.println(menu.size());

        List<Dish> collect = menu.stream().sorted(Comparator.comparingInt(t -> t.getCalories())).collect(Collectors.toList());
        System.out.println(collect);

/*        List<String> collect = menu.stream().filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = menu.stream().map(Dish::getName)
                .map(String::length)
                .distinct()
                .skip(1)
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
        System.out.println(collect1);*/

        /*menu.stream().filter(dish -> dish.getVegetarian())
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> first = integers.stream()
                .filter(num -> num % 3 == 0)
                .findFirst();
        System.out.println(first.get());

        Integer reduce = menu.stream()
                .map(dish -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);*/

    }
}

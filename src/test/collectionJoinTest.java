package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class collectionJoinTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 12, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().sorted(Comparator.comparingInt(Integer :: valueOf)).collect(Collectors.toList());
        numbers.forEach(System.out :: println);

        Integer num = 5;
        num.intValue();
        String.valueOf(num);
        Double b = 1.0;

        //List<String> list = Arrays.asList("A","B","C","D");
        List<String> list = new ArrayList<>();
        String result=  list.stream().collect(Collectors.joining());
        System.out.println(result);

        String result1=  list.stream().collect(Collectors.joining("-"));
        System.out.println(result1);

        String result2=  list.stream().collect(Collectors.joining("-","[","]"));
        System.out.println(result2);
    }
}

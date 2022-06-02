package chapter5;

import java.util.*;
import java.util.regex.Pattern;

public class Test_Reduce {
    public static void main(String[] args) {
        /*List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Optional<Integer> reduce = integers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        Optional<Integer> reduce1 = integers.stream()
                .reduce((a, b) -> a > b ? a : b);
        System.out.println(reduce1.get());

        Optional<Integer> reduce2 = integers.stream()
                .reduce(Integer::max);
        System.out.println(reduce2.get());*/

        String productionCode = "K200903610-13611";
        /*String pattern = "^K\\d{9}(-\\d{5})*";
        boolean matches = Pattern.matches(pattern, productionCode);
        System.out.println("结果? " + matches);*/
        String prefix = productionCode.substring(0, 5);
        String suffix = productionCode.substring(5, productionCode.length());
        System.out.println(prefix);
        System.out.println(suffix);

        /*Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key:--->" + entry.getKey() + "  value:--->" + entry.getValue());
        }

        map.put("e", 555);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key:--->" + entry.getKey() + "  value:--->" + entry.getValue());
        }*/

        /*for(int i = 9; i >= 0; i--){
            System.out.println(i);
        }*/

//        String str = "0501";
//        Integer index = Integer.parseInt(str);
//        System.out.println(index);
    }
}

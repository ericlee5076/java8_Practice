package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Classname Test_GroupBy
 * @Description TODO
 * @Date 2021/4/8 11:29
 * @Created by ericlee
 */
public class Test_GroupBy {
    public static void main(String[] args) {
        List<String> parameterList = Arrays.asList("1","2","2","3","3","4","4","5","6","7","8");
        List<String> resultList = parameterList.stream().collect(Collectors.collectingAndThen(Collectors
                .groupingBy(Function.identity(), Collectors.counting()), map->{
                    map.values().removeIf(size -> size == 1);
                    List<String> tempList = new ArrayList(map.keySet());
                    return tempList;
        }));
        System.out.println(resultList);


        String pattern = "^K.+\\|M.+\\|P.+\\|L.+\\|Q\\d+\\|N\\d+$";
        String str = "K2020100043|MA01003|P3010101010500000-0001|L20210211|Q20|N0100";
        String[] split = str.split("\\|");
        for (String s : split) {
            System.out.println(s);
        }
        boolean matches = Pattern.matches(pattern, str);
        System.out.println(matches);


        String pattern2 = "^[0-9]{9}-[0-9]{3}$";
        String str2 = "704080199-001";
        boolean matches2 = Pattern.matches(pattern2, str2);
        System.out.println(matches2);
    }
}

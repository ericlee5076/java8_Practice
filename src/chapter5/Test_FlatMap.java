package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_FlatMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World");


        /*=====================错误操作=====================================*/
        List<String[]> collect = strings.stream().map(s -> s.split(""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
        /*=====================正确操作=====================================*/
        List<String> collect1 = strings.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect1);

        /*=====================例子3=====================================*/
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> collect2 = numbers.stream().map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(collect2);

        /*=====================例子4=====================================*/
        List<Integer> integers1 = Arrays.asList(1, 2, 3);
        List<Integer> integers2 = Arrays.asList(3, 4);
        List<int[]> collect3 = integers1.stream()
                .flatMap(i -> integers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        for (int[] t: collect3) {
            for (int n: t) {
                System.out.print(n + ",");
            }
            System.out.println();
        }

        /*=====================例子5：返回能被3整除的数组=====================================*/
        List<int[]> collect4 = integers1.stream()
                .flatMap(i -> integers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        System.out.println("能被3整除的数组有：");
        for (int[] t: collect4) {
            for (int n: t) {
                System.out.print(n + ",");
            }
            System.out.println();
        }


    }
}

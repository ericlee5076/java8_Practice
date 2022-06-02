package chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_Range {
    public static void main(String[] args) {
        long count = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count);

        long count1 = IntStream.range(1, 100)
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count1);

        List<int[]> collect = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .boxed()
                        .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}))
                .collect(Collectors.toList());
        ;
        for(int[] num : collect){
            for(int n : num){
                System.out.print(n + ",");
            }
            System.out.println();
        }
    }
}

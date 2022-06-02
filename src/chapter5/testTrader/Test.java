package chapter5.testTrader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /*1：找出2011年发生的所有交易，bin按交易额由低到高排序*/
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(collect);

        /*2：交易员都在哪些不同城市工作过？*/
        Set<String> collect1 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
                /*.distinct()
                .collect(Collectors.toList());*/
        System.out.println(collect1);
        /*3：查找所有来自剑桥的交易员，并按照姓名排序*/
        List<Trader> collect2 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect2);
        /*4：返回所有交易员的姓名字符串，按字母顺序排序*/
        String collect3 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                //.reduce((n1, n2) -> n1 + "," + n2);
                .collect(Collectors.joining(","));
        System.out.println(collect3);
        /*5：有没有交易员在米兰工作？*/
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milan);
        /*6：打印生活在剑桥的交易员的所有交易额*/
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        /*7：所有交易中，最高的交易额是多少？*/
        Optional<Integer> reduce = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        //.reduce((v1, v2) -> v1 > v2 ? v1 : v2);
        System.out.println(reduce.get());
        /*8：找到交易额最小的交易*/
        Optional<Transaction> min = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        //.reduce(Integer::min);
        System.out.println(min.get());
    }
}

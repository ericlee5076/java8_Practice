package suanfa;

/**
 * 打印出所有的 “水仙花数 “，所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 “水仙花数 “，因为153=1的三次方＋5的三次方＋3的三次方。
 *
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class suanfa_3 {
    public static void main(String[] args) {
        for (int i = 101; i <= 999; i++){
            if(isShuiXianHua(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isShuiXianHua(int i) {
        int bai = i / 100;
        int shi = (i % 100) / 10;
        int ge = (i % 100) % 10;
        if(bai*bai*bai + shi*shi*shi +ge*ge*ge == i)
            return true;
        else return false;
    }

}

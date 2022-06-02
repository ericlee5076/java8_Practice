package suanfa;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
 * 则表明此数不是素数，反之是素数。
 * 质数又称素数.指在一个大于1的自然数中,除了1和此整数自身外,没法被其他自然数整除的数
 */
public class suanfa_2 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i ++){
            if (isSuShu(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isSuShu(int num) {
        for (int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}

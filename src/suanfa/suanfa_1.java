package suanfa;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 程序分析：   兔子的规律为数列1,1,2,3,5,8,13,21….
 */
public class suanfa_1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.println(fun(i));
        }
    }

    public static int fun(int num){
        if(num == 1 || num == 2)
            return 1;
        else
            System.out.println("第一次修改！");
            return fun(num - 1) + fun(num - 2);
    }
}

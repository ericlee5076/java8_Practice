package test;

/**
 * @Classname TestJavaHuanJing
 * @Description TODO
 * @Date 2021/10/21 15:53
 * @Created by ericlee
 */
public class TestJavaHuanJing {
    public static void main(String[] args) {
        /*String osName = System.getProperties().getProperty("os.name");
        if(osName.equals("Linux")){
            System.out.println("Linux环境!");
        }else{
            System.out.println("Windows环境!");
        }
*/

        /*int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i的值为：" + i);
        System.out.println("j的值为：" + j);
        System.out.println("k的值为：" + k);*/

        String tmp = "KF20121965-1";
        if("KF20121965-1".contains("-")){
            int index = "KF20121965-1".indexOf("-");
            tmp = "KF20121965-1".substring(0, index);
        }
        System.out.println(tmp);
    }
}

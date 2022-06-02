package chapter5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.stream.Stream;

public class Test_Iterate {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, t-> new int[]{t[1],t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println(t[0]+"|" + t[1]));

        int[] ints = {0, 1, 2,  4, 5, 6, 7, 8, 9};
        int index = halfSearch(ints, 6);
        System.out.println("索引：" + index);
    }

    public static int halfSearch(int[] array, int val){
        int beginIndex = 0;
        int endIndex = array.length - 1;
        int index = 0;
        while(beginIndex <= endIndex){
            index = (beginIndex + endIndex) / 2;
            if(array[index] == val){
                return index;
            } else if(array[index] < val){
                beginIndex = index + 1;
            } else{
                endIndex = index -1;
            }
        }
        return -1;
    }
}

package suanfa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MinWindow
 * @Description TODO
 * @Date 2021/12/2 8:11
 * @Created by ericlee
 */
public class MinWindow {
    public static void main(String[] args) {
        String source = "EBBANCF";
        String target = "ABC";
        String minWindow = getMinWindow(source, target);
        if(minWindow.length() == 0){
            System.out.println("给定的数据中不存在最小覆盖子串!");
        }else{
            System.out.println("最小覆盖子串为：" + minWindow);
        }
    }

    public static String getMinWindow(String source, String target){
        String minString = "";

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            char key = target.charAt(i);
            need.put(key, need.getOrDefault(key, 0) + 1);
        }

        //初始化窗口左右两端的索引位置
        int left = 0, right = 0;
        //记录最小覆盖子串的起始索引和长度
        int start = 0, len = Integer.MAX_VALUE;
        int valid = 0;

        while (right < source.length()){
            char c = source.charAt(right);
            //向右增大窗口
            right++;
            //进行窗口内数据的更新
            if(need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))){
                    valid ++;
                }
            }

            //判断左侧窗口是否需要收缩
            while (valid == need.size()){
                //更新最小子串
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
                //将要移出窗口的字符
                char d = source.charAt(left);
                //左移窗口
                left++;
                //再进行窗口内数据的更新
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        if(len == Integer.MAX_VALUE){
            return "";
        }
        minString = source.substring(start, start + len);
        return minString;
    }
}

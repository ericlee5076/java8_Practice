package chapter2.filterAppleByLambda;

import java.util.List;
import java.util.ArrayList;

public class FilterUtil {
    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T e : list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }

}

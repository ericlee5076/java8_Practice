package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname TestYearOfWeek
 * @Description TODO
 * @Date 2021/9/17 9:24
 * @Created by ericlee
 */
public class TestYearOfWeek {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(new Date());
        int i = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        String format = dateFormat.format(new Date());
        System.out.println(format);

    }
}

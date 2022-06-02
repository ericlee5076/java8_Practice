package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @Classname TestZhengZe
 * @Description TODO
 * @Date 2021/7/21 16:20
 * @Created by ericlee
 */
public class TestZhengZe {
    public static void main(String[] args) throws ParseException {

        String pattern1 = "^K.+\\|M.+\\|P.+\\|L.+\\|Q\\d+\\|N\\d+$";
        String pattern2 = "^[0-9]{9}\\-[0-9]{3}$";
        String pattern3 = "^K[0-9]{9}$";
        boolean matche2 = Pattern.matches(pattern2, "704080237-001");
        boolean matche3 = Pattern.matches(pattern3, "K210677409");
        System.out.println(matche2);
        System.out.println(matche3);

        /*SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        Date date1 = sdf.parse("2021-12-01 00:00:00");
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(sdf.format(c.getTime()));*/

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        System.out.println("当前日期:"+sf2.format(c.getTime()));
        c.setTime(sf.parse("2021-11-05 19:40:29"));
        c.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println("增加30天后日期:"+sf.format(c.getTime()));
        System.out.println("增加30天后日期:"+sf2.format(c.getTime()));
        System.out.println(c.getTime().after(new Date()));


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}

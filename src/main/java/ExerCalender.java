import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by twcn on 9/26/16.
 */
public class ExerCalender {
    public static void main(String[] args){
//        Calendar calendar = Calendar.getInstance(); //抽象类 不能实例化
//        System.out.println(calendar);
//
//        Date date = calendar.getTime();
//        System.out.println(date);
//
//        Date now = new Date();
//        calendar.setTime(now);

        GregorianCalendar gc = new GregorianCalendar(2020, Calendar.DECEMBER, 12);
        System.out.println(gc.getTime());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        cal.set(Calendar.YEAR, 2008);
        System.out.println(cal.getTime());
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.DAY_OF_YEAR, 100);
        cal.set(Calendar.HOUR_OF_DAY, 5);

//        int month = cal.get(Calendar.MONTH) + 1;
//        int day = cal.get(Calendar.DAY_OF_MONTH);
//        int weekday = cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println("今天是星期"+(weekday==1 ? 7 : weekday-1));


        int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        System.out.println(cal.getClass().getName());

        cal.add(Calendar.MONTH, 1);





    }
}

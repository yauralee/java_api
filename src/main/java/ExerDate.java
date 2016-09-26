import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by twcn on 9/26/16.
 */
public class ExerDate {
    public static void main(String[] args){
//        Date date = new Date();
//        System.out.println(date);
//
//        long time = date.getTime();
//        System.out.println(time);
//
//        time += 24 * 60 * 60 * 1000;
//        date.setTime(time);
//        System.out.println(date);

//        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String str = sdf.format(now);
//        System.out.println(str);

        String str = "2008-08-08 12:34:56";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}

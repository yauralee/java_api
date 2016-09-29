import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by twcn on 9/29/16.
 */
public class FileOutputStreamDemo {
    public static void main (String[]args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        FileOutputStream fos1 = new FileOutputStream(new File("fos1.txt"));
//
//        fos.write(97);//a
//        String str = "我爱北京，我爱天安门，我爱吃包子";
//        byte[] data = str.getBytes("UTF-8");
//        fos.write(data);
//        fos.close();

        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        String str = "我爱北京天安门";
        fos.write(str.getBytes());
        fos.close();


    }
}

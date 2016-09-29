import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by twcn on 9/29/16.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[50];
        int len = fis.read(data);//返回读取的字节量

        String str = new String(data,0,len,"UTF-8");
        System.out.println(str);
        fis.close();
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by twcn on 9/29/16.
 */
public class CopyFileByStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos_copy.txt");
        byte[] buf = new byte[1024 * 10];
        int len = -1;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();
    }

    }

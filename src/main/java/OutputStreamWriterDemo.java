import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by twcn on 9/29/16.
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");//指定字符集
        String str = "我爱北京，我爱天安门";

        osw.write(str);
        osw.write("我爱吃");
        osw.write("包子");
        osw.close();

    }

}

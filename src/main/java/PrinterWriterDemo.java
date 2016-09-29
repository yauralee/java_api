import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by twcn on 9/29/16.
 */
public class PrinterWriterDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("uber涨价了，坐不起了");
        pw.println("～～～");
        pw.close();//不关闭pw的情况下，文件存在，但内容只存在于缓冲区,文件中无内容
    }

}

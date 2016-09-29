import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by twcn on 9/29/16.
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        int d = -1;
        while((d=isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }

}

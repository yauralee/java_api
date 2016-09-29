import java.io.*;
import java.util.Scanner;

/**
 * Created by twcn on 9/29/16.
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //缓冲字符流只能处理字符流，不能处理字节流，所以这里必须加上OutputStreamWriter
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        PrintWriter pw = new PrintWriter(osw,true);//true 可自动行刷新
        String line = null;
        while(true){
            line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);//自动行刷新只有调用println时才有效果，调用print无效果
        }
        pw.close();
    }

}

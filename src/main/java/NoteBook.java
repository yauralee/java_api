import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by twcn on 9/29/16.
 */
public class NoteBook {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("pw1.txt");//传入的是文件时PrintWriter不能自动行刷新
        System.out.println("请输入内容：");
        String line = null;
        while(true){
            line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.print(line);
            pw.flush();//即时输出（手动行刷新）  每写出一行字符串时不只存在于缓冲区，文件中也即时生成内容
        }
        System.out.println("88");
        pw.close();
    }

}

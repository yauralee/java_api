import java.io.*;

/**
 * Created by twcn on 9/29/16.
 */
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("fos_copy.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d = -1;

        while((d=bis.read())!=-1){
            bos.write(d);
        }
        System.out.println("复制完毕");
        bis.close();//关闭流时只需关闭高级流即可，高级流会自动关闭低级流
        bos.close();
    }
}

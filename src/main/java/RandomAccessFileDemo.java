import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by twcn on 9/29/16.
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
//        RandomAccessFile raf = null;
//        try {
//            raf = new RandomAccessFile("demo.txt","rw");
//            //写出一个字节
//            raf.write(2);
//            System.out.println(raf.read());//-1,因为此时指针在文件末尾
//            raf.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        RandomAccessFile raf = null;
//        try {
//            raf = new RandomAccessFile("demo.dat","r");
//            /*
//             * 从文件中指针当前位置读取一个字节
//             * 将该字节以int形式返回
//             * 若读取到了文件末尾，则返回值为-1
//             */
//            int i = raf.read();
//            System.out.println(i);//2
//            raf.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        RandomAccessFile raf = new RandomAccessFile("test.txt","rw");

        String str = "我爱北京天安门";
        byte[] data = str.getBytes();
        System.out.println(data.length);
        raf.write(data,0,8);//我爱北京
        raf.write(data);//我爱北京天安门
        raf.close();
    }
}

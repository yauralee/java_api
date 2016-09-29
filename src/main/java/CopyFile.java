import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by twcn on 9/29/16.
 */
public class CopyFile {
    public static void main(String[] args){
        try {
            RandomAccessFile src = new RandomAccessFile("test.txt", "r");
            RandomAccessFile des = new RandomAccessFile("test_copy.txt", "rw");
            int d = -1;
            long start = System.currentTimeMillis();
            while((d=src.read())!=-1){
                des.write(d);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制完毕");
            System.out.println("耗时："+(end-start)+"ms");
            src.close();
            des.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

import java.io.File;
import java.io.IOException;

/**
 * Created by twcn on 9/29/16.
 */
public class File2 {
    public static void main(String[] args){
        File file = new File("."+File.separator+"test.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("创建成功");


        if(file.exists()){
            file.delete();
        }
        System.out.println("删除成功");

    }
}

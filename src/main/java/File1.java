import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by twcn on 9/29/16.
 */
public class File1 {
    public static void main(String[] args){
        //File file = new File("./demo.txt");//不同平台上层级分隔符不同，所以不建议使用斜杠表示，建议用下面的方法
        File file = new File("."+File.separator+"demo.txt");
        String name = file.getName();
        System.out.println("文件名:"+name);

		/*
		 * 获取文件大小
		 * 文件占用的字节量,返回long类型
		 */
        long length = file.length();
        System.out.println("文件占用的字节量："+length);//指文件中内容占的字节

        file.isHidden();//文件是否被隐藏
        file.canRead();//文件是否可读
        file.canWrite();//是否可写
        file.canExecute();//是否可运行

        long l = file.lastModified();//最后修改时间。表示自1997.01.01至最后一次修改时间所经过的毫秒值，返回long
        //用特定格式输出l
        Date date = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH：mm:ss");
        System.out.println(sdf.format(date));
    }
}

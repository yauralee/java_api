import java.io.File;

/**
 * Created by twcn on 9/29/16.
 */
public class File3 {
    public static void main(String[] args){
//        File dir = new File("demo");
//        if(!dir.exists()){
//            dir.mkdir();
//            System.out.println("创建目录完毕");
//        }

//        if(dir.exists()){
//            dir.delete();
//            System.out.println("删除完毕");
//        }


//        File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+
//                File.separator+"e"+File.separator+"f");
//
//        if(!dir.exists()){
//            dir.mkdirs();
//            System.out.println("创建完毕");
//        }


        File dir = new File(".");

        if(dir.isDirectory()) {
            File[] subs = dir.listFiles();
            for (File sub : subs) {
                System.out.print(sub.isFile() ? "文件：" : "目录：");
                System.out.println(sub.getName());
            }
        }
    }
}

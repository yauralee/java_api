import java.io.File;

/**
 * Created by twcn on 9/29/16.
 */
public class DeleteDir {
    public static void deleteFile(File file) {
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (File sub : subs) {
                deleteFile(sub);
            }
        }
        file.delete();
    }
}

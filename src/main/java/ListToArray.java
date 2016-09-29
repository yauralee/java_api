import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by twcn on 9/27/16.
 */
public class ListToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        //Object[] array = c.toArray();//默认生成的数组是Object型
        String[] array = c.toArray(new String[c.size()]);
//		String[] array = c.toArray(new String[]{});//这样写和上行效果相同
        //String[] array = c.toArray(new String[0]);//当所给数组长度不够时，系统自己设置长度不使用用户给的
        //String[] array = c.toArray(new String[10]);//当所以数组长度大于元素个数时，其余元素为null
        System.out.println(Arrays.toString(array));//直接用数组的toString方法输出元素
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

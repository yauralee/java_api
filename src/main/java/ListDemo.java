import java.util.ArrayList;
import java.util.List;

/**
 * Created by twcn on 9/27/16.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        String str = list.get(1);
        System.out.println(str);

        String old = list.set(2, "三");//返回被替换的元素
        System.out.println(list);//[one, two, 三]
        System.out.println(old);//three,为被替换的元素

        //String old1 = list.set(3,"三");//数组下标越界


        list.add(1,"2");//
        System.out.println(list);


        String re = list.remove(2);
        System.out.println(list);
        System.out.println("被删除的元素是：" + re);


        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.println(list);
        List<Integer> subList = list1.subList(3,8);//含头不含尾
        System.out.println(subList);

        for(int i=0; i<subList.size(); i++){
            int num = subList.get(i);
            num *= 10;
            subList.set(i, num);
        }
        System.out.println(subList);
        System.out.println(list);
    }
}

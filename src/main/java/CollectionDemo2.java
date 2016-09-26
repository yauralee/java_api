import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by twcn on 9/26/16.
 */
public class CollectionDemo2 {
    public static void main(String[] args){
//        Collection c = new ArrayList();
//        c.add(new Cell(2,2));
//        c.add(new Cell(4,4));
//        System.out.println(c);
//
//        Cell cell = new Cell(2,2);
//        boolean contains = c.contains(cell);  //因为Cell重写了equals方法，所以返回true, 否则按默认＝＝比较，返回false
//
//        c.isEmpty();
//        c.size();
//        c.add("one");
//        c.clear();

//        Collection c = new ArrayList();
//        c.add("one");
//        c.add("two");
//        c.add("three");
//        c.add("two");
//        c.remove("two");
//        System.out.println(c);  //[one, three, two]


        //可重复
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("cpp");
        c1.add("php");
        c1.add("c#");
        System.out.println(c1);//[java, cpp, php, c#]
        Collection c2 = new ArrayList();
        c2.add("oc");
        c2.add("java");
        System.out.println(c2);//[oc, java]

        c2.addAll(c1);
        System.out.println(c2);//[oc, java, java, cpp, php, c#]

        //Set集合，不可重复 无序
        Collection c3 = new HashSet();
        c3.add("oc");
        c3.add("java");
        System.out.println(c3);//[java, oc]不按添加顺序排列

        c3.addAll(c1);
        System.out.println(c3);//[cpp, php, c#, java, oc]重复元素不放入

        Collection c4 = new ArrayList();
        c4.add("java");
        c4.add("c#");
        boolean contains = c1.containsAll(c4);
        System.out.println(contains);//true


    }
}

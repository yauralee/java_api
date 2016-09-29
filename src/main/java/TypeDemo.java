/**
 * Created by twcn on 9/27/16.
 */
public class TypeDemo {
    public static void main(String[] args) {
        Point1<Integer> p1 = new Point1<Integer>(1,2);
        p1.setX(1);
        int x = p1.getX();
        System.out.println(x);

        Point1 p2 = p1;
        p2.setX("1");


        System.out.println(x);
    }


}

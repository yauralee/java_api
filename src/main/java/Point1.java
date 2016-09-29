/**
 * Created by twcn on 9/27/16.
 */
public class Point1<E> {
    private E x;
    private E y;
    public Point1(E x, E y) {
        super();
        this.x = x;
        this.y = y;
    }
    public E getX() {
        return x;
    }
    public void setX(E x) {
        this.x = x;
    }
    public E getY() {
        return y;
    }
    public void setY(E y) {
        this.y = y;
    }
    public String toString() {
        return "[" + x + "," + y + "]";
    }
    public static void main(String[] args) {

        Point1<Integer> p = new Point1<Integer>(1,2);
        System.out.println(p);
        p.setX(2);
        System.out.println(p);

        Point1<String> p2 = new Point1<String>("一","二");
        p2.setX("1");
        System.out.println(p2);
    }


}

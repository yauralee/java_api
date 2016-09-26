/**
 * Created by twcn on 9/25/16.
 */
public class Point {
    int x;
    int y;
    public String toString(){         //重写Object的toString方法
        return "x=" + x + ", y=" + y;
    }
    public static void main(String[] args){
        Point p = new Point();
        p.x= 1;
        p.y = 2;
        String str = p.toString();
        System.out.println(str);
        System.out.println(p);

        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 2;

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

    //重写equals方法
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(obj instanceof Point){
            Point p = (Point)obj;
            return p.x == this.x && p.y == this.y;
        }else{
            return false;
        }
    }

}

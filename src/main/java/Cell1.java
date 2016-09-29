/**
 * Created by twcn on 9/27/16.
 */
public class Cell1 implements Comparable<Cell1>{
    private int x;
    private int y;
    public Cell1(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    public int compareTo(Cell1 o){
        int len = this.x*this.x+this.y*this.y;
        int olen = o.x*o.x+o.y*o.y;
        return len-olen;
    }
}


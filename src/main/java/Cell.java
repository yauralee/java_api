/**
 * Created by twcn on 9/26/16.
 */
public class Cell {
    public int x;
    public int y;
    public Cell(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x+","+y;
    }

    //重写equals方法
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(o instanceof Cell){
            Cell c = (Cell)o;
            return c.x==this.x && c.y==this.y;
        }
        return false;
    }

}

package Subjects;

/**
 *
 * @author abdo
 */
public class Point {

    private long x;
    private long y;

    
    
    
    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }
    
    
    /**
     * @return the x
     */
    public long getX() {
        return x;
    }

    /**
     * @param x the x to set
     * @return 
     */
    public Point setX(long x) {
        this.x = x;
        return Point.this;
    }

    /**
     * @return the y
     */
    public long getY() {
        return y;
    }

    /**
     * @param y the y to set
     * @return 
     */
    public Point setY(long y) {
        this.y = y;
        return Point.this;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

}

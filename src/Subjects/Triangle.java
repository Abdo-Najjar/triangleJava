package Subjects;

/**
 *
 * @author abdo
 */
public class Triangle {

    private Point[] Points;

    public Triangle(Point[] Points) {
        this.Points = Points;
    }

    public Triangle() {

        this.Points = new Point[3];
    }

    /**
     * @return the Points
     */
    public Point[] getPoints() {
        return Points;
    }

    /**
     * @param Points the Points to set
     * @throws java.lang.Exception
     */
    public void setPoints(Point[] Points) throws Exception {

        if (Points.length > 3 || Points.length <= 0) {
            throw new Exception("Invalid Points");
        }

        this.Points = Points;
    }

    public void lengthAllSides() {

        Point point1 = this.Points[0];
        Point point2 = this.Points[1];
        Point point3 = this.Points[2];

        long firstVertex = this.getLength(point1, point2);
        long secondVertex = this.getLength(point1, point3);
        long thirdVertex = this.getLength(point2, point3);

        System.out.println("First vertex Length equals: " + firstVertex + "\n"
                + "Second vertex length equals: " + secondVertex
                + "\n" + "Third Vertex length equals: " + thirdVertex
        );

    }

    private long getLength(Point point1, Point point2) {

        long point1x = point1.getX();
        long point1y = point1.getY();

        long point2x = point2.getX();
        long point2y = point2.getY();

        return (long)Math.sqrt((point2x-point1x)*(point2x-point1x) + (point2y-point1y)*(point2y-point1y));
    }

}

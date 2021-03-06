public class Triangle{
  private Point v1,v2,v3;
  public Triangle(Point a, Point b, Point c){
    v1 = new Point(a.getX(),a.getY());
    v2 = new Point(b.getX(),b.getY());
    v3 = new Point(c.getX(),c.getY());
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter(){
    return v1.distance(v1,v2) + v1.distance(v1,v3) + v2.distance(v2,v3);
  }
  public Point getVertex(int index){
    Point[] arr = new Point[3];
    arr[0] = v1;
    arr[1] = v2;
    arr[2] = v3;
    return new Point(arr[index]);
  }
  public String toString(){
    return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }
  public void setVertex(int index, Point newP){
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }
}

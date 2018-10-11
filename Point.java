public class Point{
  private double x,y;
  public Point(double xcor,double ycor){
    x = xcor;
    y = ycor;
  }
  public Point(Point p){
    x = p.x;
    y = p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public double distanceTo(Point p){
    return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
  }
  public static double distance(Point g, Point h){
    return Math.sqrt(Math.pow((g.x - h.x), 2) +  Math.pow((g.y - h.y),2));
  }
  public String toString(){
    return "(" + x + "," + y + ")";
  }
}

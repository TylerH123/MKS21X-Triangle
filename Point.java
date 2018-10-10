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
  public double dist(double x1, double y1, double x2, double y2){
    double inside;
    inside = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
    return Math.sqrt(inside);
  }
  public double distanceTo(Point p){
    return dist(this.x, this.y, p.x, p.y);
  }
  public double distance(Point ggg, Point hhh){
    return dist(ggg.x, ggg.y, hhh.x, hhh.y);
  }
  public String toString(){
    return "(" + x + "," + y + ")";
  }
}

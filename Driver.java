public class Driver{
  public static void main(String[] arg){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(3,1);
    //for the 3 distance functions below Determine:
    //a)static/non-static
    //b)what class the method is located in
    //System.out.println(  distance(P1,P2)); //static in the demo class

    System.out.println(P1.distance(P1,P2)); //static in the Point class

    System.out.println(P1.distanceTo(P2)); //non-static in the Point class.
    //It is IMPLIED strongly that this is non static because you need info from P1 to calculate the distance
    //You cannot tell by the calling style alone, this is why we prefer to use CLASS.Method() for static calls.
    System.out.println(P1.toString());
    Triangle t1 = new Triangle(P1, P2, P3);
    Triangle t2 = new Triangle(1.0,1.0,2.0,2.0,3.0,1.0);
    System.out.println(t1.getPerimeter());
    System.out.println(t2.getPerimeter());
    System.out.println(t1.getVertex(2));
    System.out.println(t1.toString());
    Point c = new Point(5,5);
    t1.setVertex(1, c);
    System.out.println(t1.getVertex(1));
  }
}

/*


*/


public class A0 {

  public static char sq = 178;

public static double areaOfCircle(double r) {
  return 3.14* (r*r);
} //method to calculate area of circle

public static void rectangle(double width, double length) {
  double areaOfRectangle = length * width;
  System.out.println("Length = " + length + "m");
  System.out.println("Width = " + width + "m");
  System.out.println("Area = " + areaOfRectangle + "cm" +sq);
}

public static void main(String[] args){

  //Q1 Area of a circle
  System.out.println("The area of this circle is " + areaOfCircle(15) + "cm" + sq);

  //Q2 Wayne Gretzky
  String name = "Wayne Gretzky";
  int num = 99;
  System.out.println(name + " is the number " + num);

  //Q3 Area of rectangle
  rectangle(4.8, 5.7);

  
 }// close main
}// close class
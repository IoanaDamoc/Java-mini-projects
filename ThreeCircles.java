/*Write a Program (int)
Write a Java program that calculates and shows the areas and circumferences of three circles, where the radii are 3, 100, and 8.75 centimetres.*/
public class ThreeCircles
{
static void AreaCircumference(double radius)
   {
   final double pi = 3.14159;
   double area = pi*(radius*radius);
   System.out.println("The area of the circle with the radius " + radius + " is: " + area);
   double circumference = 2*pi*radius;
   System.out.println("The circumference of the circle with the radius " + radius + " is: " + circumference);
   }
  public static void main(String[] args)
  {
  AreaCircumference(3);
  AreaCircumference(100);
  AreaCircumference(8.75);
  }
}
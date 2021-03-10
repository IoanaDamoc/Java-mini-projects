/*Write a Java program to help a carpenter calculate the quantity of materials required for a job.
A carpenter installs window units and wants a program which will calculate the amounts of wood and glass that need to be purchased. He/she wants to 
just enter the dimensions of the window (in meters) and then get a display of the amount of wood and glass required. Whilst glass is sold by the square 
meter, the wood supplier sells by the foot, so the amount of wood required must be given in feet and inches. The wood window frame is 1 inch thick.
Furthermore, the width of the window must be between 0.5 and 3.5m inclusive and the height is constrained between 0.5 and 2.0 meters inclusive. Note
that 1 meter = 3.281 feet and there are 12 inches in a foot.*/
import java.util.Scanner;
public class CarpenterTool
{

   public static void main(String[] args)
   {
    final double woodThick = 0.0254; //wood frame is 1 inch = 0.0254 m 
    Scanner window = new Scanner(System.in);//creating a new Scanner object to read user input
    System.out.print("Enter width of the window in meters:");//asking the user for a width and a height of the hole window(frame+glass)
    double width = window.nextDouble();//saving user input into "width" attribute
    System.out.print("Enter height of the window in meters:");//same as width
    double height = window.nextDouble();
    //Check if the values are in the given range of 0.5 - 3.5m (width) and 0.5 - 2.0m (height)
    if ((width >=0.5 && width <=3.5) && (height >=0.5 && height <=2.0))
     {
      double woodNeeded = 2*(width + height - 2*woodThick);//calculating the amount of wood needed in meters
      double woodFeet = woodNeeded*3.281;// transform into feet 1m = 3.281 feet
      double glassNeeded = (height - 2* woodThick)*(width - 2*woodThick);//calculating the amount of glass needed in square meters
      System.out.println("You will need: " + woodFeet + " feet of wood");//display the results
      System.out.println("You will need: " + glassNeeded + " square meters of glass");
     }
      else
      {
       System.out.println("You will need to enter a width between 0.5m and 3.5m and a height between 0.5m and 2.0m");
      }
   }
}
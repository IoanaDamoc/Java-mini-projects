/*Design and write a program to:
Read int values from the keyboard until a value of 999 is entered.
The program should then calculate the average (as a double) of all the numbers except the terminating value.
(The 999 terminating value is known as a sentinel.)
You will need a loop and if/else.*/
import java.util.Scanner;
public class Sentinel
{
   public static void main(String[] args)
   {
      int value, sum, count;
      double average;
      sum = 0;
      count = 0;
      average = 0;
      Scanner keyboard = new Scanner(System.in);//creating a new object for Scanner class to take input from user
      System.out.println("Enter an int number or 999 to end: ");
      value = keyboard.nextInt();//taking input from keyboard
      while (value != 999){
      sum =sum+value;
      count++;
      average = sum/count;
      System.out.println("Enter another int number or 999 to end: ");
      value = keyboard.nextInt();//taking another input from keyboard
      }
      System.out.println("The average of the numbers you've just entered is :" + average);
     }
}

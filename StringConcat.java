/*Write a program (str)
Write a Java program that prompts for two text messages from the user via keyboard, connects them together, and prints the result on screen.*/
import java.util.Scanner;//import Scanner class
public class StringConcat
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);//creating a new object for Scanner class to take input from user
   System.out.print("Enter message1: ");
   String first = keyboard.nextLine();//taking input from keyboard
   System.out.print("Enter message2: ");
   String second = keyboard.nextLine();
   System.out.println("Output: " + first + " " + second );
   }
}
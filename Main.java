/*Task 2. Can you correct this?

import java.util.Scanner; // Import the Scanner class
Public class Main
{
public static void main()
{
Scanner keyboard = new Scanner(System.in);
final int CURRENT YEAR;
int age;
System.out.print("How old are you this year? ");
Age = keyboard.nextDouble()
System.out.println("I think you were born in " + CURRENT YEAR - age);
}
}*/

import java.util.Scanner;
public class Main  //public starts with lowercase p
{
   public static void main(String[] args)//indentation added & added the string array command line argument(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How old are you this year? ");
      int age = keyboard.nextInt(); //created the variable age of type integer and saving users' input in this variable on the same line 
      final int currentYear = 2021; //changed the name for the current year variable and assigned it the value 2021, which is the current year
      System.out.println("I think you were born in " + (currentYear - age));/*adding brackets so that the difference between currentYear and age is 
                                                                                   calculated first and only the final result is printed on users' screen*/
}
}
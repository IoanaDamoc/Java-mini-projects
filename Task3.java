/* Task 3.1 What is this programme doing? A: Displays all even numbers lower or equal to the inputed number
        3.2 What is the output if the user entered a value of 10? A: 2 4 6 8 10
        3.3 Can you change this to odd numbers?
        3.4 Extension: Add the option to quit and rerun the programme
3.1:
import java.util.Scanner;
public class Task3
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.print("Please Enter a number: ");
int x = keyboard.nextInt();
for (int i = 1; i <= x; i++) {
if (i % 2 == 0) { //3.3 Just changing 0 with 1 will make the programme work for odd numbers
System.out.println(i);
}
}
}
}*/
// 3.4 Add the option to quit and rerun the programme:
import java.util.Scanner;
public class Task3
{
 static void evenNumbers()//puting Task3.1 program into a method called evenNumbers. Method will print all even no. below the given no.
    {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please Enter a number: ");
   int x = keyboard.nextInt();
   for (int i = 1; i <= x; i++) {
      if (i % 2 == 0) { 
         System.out.println(i);
                       }
                                 }
   }
 public static void main(String[] args)
   {
     evenNumbers();//calling the method first time
     Scanner key = new Scanner(System.in);   //creating a Scanner object to take stay/leave input from user                    
     System.out.print("What would you like to do next? Type r to rerun or any other letter to quit: ");
     String check = key.nextLine();

        while (check.equals( "r"))//while the input = "r" we keep calling the evenNumbers method
        {
         evenNumbers();                            
         System.out.print("What would you like to do next? Type r to rerun or any other letter to quit: ");//also keep asking for a stay/leave input
         check = key.nextLine();
         } 
   }
}
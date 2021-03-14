/* (Extension)Convert
Convert the following code into a switch statement, when k contains an int value.
170 String cmd;
if(k==1){ cmd = "Edit";
}
else if(k==2){ cmd = "Add";
}
else if(k==3)
{
cmd = "Quit";
}
else{
cmd = "Invalid";
} */
import java.util.Scanner;
public class SwitchStatement
{
   public static void main(String[] args)
   {
     Scanner keyboard = new Scanner(System.in);//creating a new Scanner object named user
     System.out.print("Enter a number: ");//asking user for a username
     int k = keyboard.nextInt();
     switch (k) {//using the switch statement to pick a line to print accordingly with the user's input
      case 1:
      System.out.println("Add");
      break;
      case 2:
      System.out.println("Edit");
      break;
      case 3:
      System.out.println("Quit");
      break;
      default:System.out.println("Invalid");
      }
    }
}


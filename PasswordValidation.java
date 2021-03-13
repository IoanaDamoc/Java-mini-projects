/*Write a Java program that lets a user choose his/her username and password.
The program verifies whether the chosen username and password are valid. If either one of them is invalid, it notifies the user and explains the cause of 
invalidity. The rules for choosing valid usernames and passwords are: 
• A username must be of length 6-15 characters.
• A username must start with an uppercase English alphabet A to Z.
• A password must not be shorter than 8 characters but must not exceed 256.
• There cannot be any types of parentheses or whitespaces in a valid username or password.
• A password cannot contain or be the same as its associated username. */

import java.util.Scanner;//import the Scanner class
public class PasswordValidation
{
/*Creating a method that checks if a given string has the required length. We will use this method to check both the username's and password's length.
The method has 3 parameters: the string to be checked, a minimum length and a maximum length.The method prints a message if the length of the string 
is outside the min or max parameters: */
static void checkLength(String user,int min,int max)
{
   if(user.length()<min)
   {
   System.out.println("You must enter at least " + min + " characters");
     }else if (user.length()>max){
     System.out.println("There cannot be more than " + max + " characters");
     }
}
/*Creating a method that checks for whitespaces and parantheses. The method takes a string as parameter and returns a message if the string contains
whitespaces or parentheses.*/
static void checkParentheses(String user)
{
if (user.contains(" ") || user.contains("(") || user.contains(")") || user.contains("[") || user.contains("]")
         || user.contains("{") || user.contains("}")) 
       {
      System.out.println("Username/password cannot contain whitespaces or parantheses");
       }
}
   public static void main(String[] args)
   {
     Scanner user = new Scanner(System.in);//creating a new Scanner object named user
     System.out.print("Enter username: ");//asking user for a username
     String username = user.nextLine();
     checkLength(username,6,15);//call the checkLength method with username,6 and 15 as arguments as given in the exercise
     char firstLetter = username.charAt(0); //saving the first letter of the username in the firstLetter attribute
     if (Character.isLowerCase(firstLetter)) //check if the firstLetter is a lower case letter, and return a message in case it is
     {
     System.out.println("Username cannot start with a lowercase letter");
     }
     checkParentheses(username);//calling the checkParentheses method for the username
     System.out.print("Enter password: ");//asking the user for a password
     String password = user.nextLine();//reading user's input
     checkLength(password,8,256);//call the checkLength method with password,8 and 256 as arguments as given in the exercise
     checkParentheses(password);//calling the checkParentheses method for the password
     if (password.contains(username))
     {
     System.out.println("Password cannot contain the username");
     }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //assume all prints in directions mean to add a newline after: (use println)

        //create a scanner object reading from System.in
        Scanner scan= new Scanner(System.in);
        //print out:  enter a whole number
        System.out.println("enter a whole number");
        //get a line of input convert and save the input into an integer variable (you can assume the user enters a  valid whole number)
        String userNum = scan.nextLine();
        int num1 = Integer.parseInt(userNum);
        //write an if statement that prints "hello world" if the input was less than 4
        if (num1 < 4) System.out.println("hello world");
        //write an if statement that prints out "Why did the man fall down the well?" if the input was less than 5
        if (num1 < 5) System.out.println("Why did the man fall down the well?");
        //write an if statement that prints out "Because he couldnt see that well." if the input was greater than 1
        if (num1 > 1) System.out.println("Because he couldn't see that well.");
        //write an if statement that prints out "When does a joke become a dad joke?"  if the input was equal to 8
        if (num1 == 8) System.out.println("When does a joke become a dad joke?");
        //write an if statement that prints out "When it becomes apparent."  if the input was greater than or equal to 8
        if (num1 >= 8) System.out.println("When it becomes apparent.");
        //write an if statement that prints out "I used to hate facial hair," if the input is less than or equal to 12
        if (num1 <= 12) System.out.println("I used to hate facial hair,");
        //write an if statement that prints out " but then it grew on me."  if the input does not equal 23
        if (num1 != 23) System.out.println(" but then it grew on me.");
    }




    }


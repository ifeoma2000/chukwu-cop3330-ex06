package ex06;
/*
Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.

Challenge
Handle situations where the program returns a negative number by stating that the user can already retire.
 */
//UCF COP3330 Summer 2021 Assignment 1 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
import java.util.Date;
public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age?");
        int number1 = input.nextInt();
        System.out.println("At what age would you like to retire?");
        int number2 = input.nextInt();
        int difference = number2 -  number1;
        System.out.printf("You have %d years left until you can retire.\n", difference);
        Date d=new Date();
        int year=d.getYear();
        int currentYear = year + 1900;
        int retiredYear = currentYear + difference;
        System.out.printf("It's %d, so you can retire in %d.", currentYear, retiredYear);
    }
}

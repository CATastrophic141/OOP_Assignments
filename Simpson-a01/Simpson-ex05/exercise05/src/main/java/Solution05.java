/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Import scanner function
Create a scanner object
Prompt user to enter a number
Save number to a double variable
Prompt user to enter another number
Save number to another double variable
Perform addition with the numbers
Perform subtraction with the numbers
Perform division with the numbers
Perform multiplication with the numbers
Print out the results from the arithmetic performed with the two numbers
*/

import java.util.Scanner;
public class Solution05 {
        public static void main (String[] args){
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number");
                double num1 = input.nextDouble();
                System.out.println("Please enter another number");
                double num2 = input.nextDouble();
                double addNums = num1 + num2;
                double subNums = num1 - num2;
                double multNums = num1 * num2;
                double divNums = num1 / num2;
                System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.3f\n%.2f / %.2f = %.3f",
                        num1, num2, addNums, num1, num2, subNums, num1, num2, multNums, num1, num2, divNums);
        }
}

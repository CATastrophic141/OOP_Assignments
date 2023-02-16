/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Import scanner function
Declare the scanner object
Prompt user to enter string
Save user input to a string variable
use length function to save string length to a variabe
Print string and string size using string and string length variables
*/

import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string");
        String userInput = input.nextLine();
        int inputLength = userInput.length();
        System.out.printf("%s has %d characters", userInput, inputLength);
    }
}

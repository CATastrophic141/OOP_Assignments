/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Import scanner function
Create scanner object
Prompt user to input first string
Save user input to a string variable
Prompt user to input second string
Save user input to another string variable
Print the two strings together
Within printed string, use \" to use quotation marks
*/

import java.util.Scanner;
public class Solution03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a quote");
        String quote = input.nextLine();
        System.out.println("Please enter who said the quote");
        String speaker = input.nextLine();
        System.out.println(speaker + " said: \"" + quote +"\"");
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Import scanner function
create scanner object
Print statement asking for first name
Save user input to first name variable
Print statement asking for last name
Save user input to last name variable
Concactenate first name and last name variables with a space character into a full name variable
Print out greeting using full name variable
*/

import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.print("What is your first name?\n");
        String userFirstName = stdin.nextLine();
        System.out.print("What is your last name?\n");
        String userLastName = stdin.nextLine();
        String userFullName = userFirstName + ' ' + userLastName;
        System.out.printf("Hello %s, How are you?", userFullName);
    }
}

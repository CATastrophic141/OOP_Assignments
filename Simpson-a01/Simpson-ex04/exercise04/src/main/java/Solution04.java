/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Import scanner function
Create a scanner object
Prompt user to enter a noun
Save the noun to a string
Prompt user to enter a verb
Save verb to a string
Prompt user to enter an adjective
Save adj to a string
Prompt user to enter an adverb
Save adv to a string
Print all strings in an appropriate madlib statement
*/

import java.util.Scanner;
public class Solution04 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a noun:");
    String noun = input.nextLine();
    System.out.println("Please enter a verb:");
    String verb = input.nextLine();
    System.out.println("Please enter an adjective:");
    String adjective = input.nextLine();
    System.out.println("Please enter an adverb:");
    String adverb = input.nextLine();
    System.out.printf("So you say you %s %s your %s %s? That's kinda weird, ngl.", adverb, verb, adjective, noun);
    }
}

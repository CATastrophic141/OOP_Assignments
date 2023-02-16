import java.util.Scanner;
import java.util.Random;

//Write a version of the program that displays different greetings for different people.

public class Challenge02 {
    public static void main(String[] args){
            Scanner stdin = new Scanner(System.in);
            Random rand = new Random();
            int randNum = rand.nextInt(101);
            System.out.print("What is your first name?\n");
            String userFirstName = stdin.nextLine();
            if (randNum % 2 == 0) {
                System.out.printf("Hello %s, How are you?", userFirstName);
            }
            else {
                System.out.printf("Greetings, %s! It's a wonderful day, is it not?", userFirstName);
            }
        }
    }

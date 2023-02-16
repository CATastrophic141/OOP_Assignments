import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Solution03 {

    public static void GUI(String nameString){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(300,100));
        frame.setTitle("Ex01-Ch01 GUI");

        JLabel text1 = new JLabel("Hello " + nameString + ", how are you?");

        panel.add(text1);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your name:\n");
        String name = input.nextLine();
       GUI(name);
    }
}

// Connor Davis - Assignment 1
// 9-1-25

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //finish this one for me by receiving and printing the user's age back to them
        System.out.println("How old are you?: ");
        String age = sc.nextLine();
        System.out.println("You are: " + age + " years old! ");
        // What i learned: I have to take the guess that 'sc.nextLine()' is the equivalent of 'input()' in python. I mainly did this by following the example on the PDF. I'm also fairly sure the 'String' tag is creating/defining the 'name' variable, but not fully sure on that yet.

        //can you do some math for me? take these variables and print out the sum of them!
        int num1=10;
        int num2=37;
        System.out.println(" ");
        System.out.println("10+37= ");
        System.out.println(num2+num1);
        //What i learned: Math works similar to python, as it is just math. So far seems  math is the most simple to wrap my head around as the way java codes is more complex and 'wordy' to me. However, I  have no idea what scanner is or does.

    }
}

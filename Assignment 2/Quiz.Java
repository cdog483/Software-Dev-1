import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Question 1: What color is Kiryu's suit in the majority of the Yakuza series");
        System.out.println("1. Red");
        System.out.println("2. Gray");
        System.out.println("3. Yellow");
        System.out.println("4. White");

        String answer1 = sc.nextLine();

        if (answer1.equals("2")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer1.equals("Gray")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer1.equals("gray")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect");
        }
        //There maybe a more efficent method to doing this, but as of now this is what I know to do. I also think this is important as there is no clear directions of answering just the number or typing the answer out, so the user will probs end up doing these commonly

        System.out.println("Question 2: What is the tattoo on Ichiban's back depicting?");
        System.out.println("1. Dragonfish");
        System.out.println("2. Koi fish");
        System.out.println("3. Kirin");
        System.out.println("4. Red Dragon");

        String answer2 = sc.nextLine();

        if (answer2.equals("1")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer2.equals("Dragonfish")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer2.equals("dragonfish")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println("Question 3: What is Majima's title across the series");
        System.out.println("1. The Dragon of Kansai");
        System.out.println("2. The Lifeline of Kamurocho");
        System.out.println("3. The Mad Dog of Shimano");
        System.out.println("4. The Legendary Detective");

        String answer3 = sc.nextLine();

        if (answer3.equals("3")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer3.equals("The Mad Dog of Shimano")) {
            System.out.println("Correct!");
            score = score + 1;
        } else if (answer3.equals("the mad dog of shimano")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println("Congrats, you have finished the quiz. Your score is:");
        System.out.println(score);
    }
}

//What I learned: This works fairly similar to a similar assignment I did in python, just as pure java more lengthy and wordy. The biggest thing was making sure all the variable names and stuff are correct, as well as learning about the .equals for strings

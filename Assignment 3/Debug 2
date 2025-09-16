import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
       System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
           System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int p2 = sc.nextInt();
        //here's a hint
        int sum = 1;
        for (int i = 1; i < p2; i++){
            sum = sum * i;
        }
        System.out.println("Your sum is: "+sum);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int p3 = sc.nextInt();
        int sum2 = 0;
        for (int i = 1; i < p3; i+=2){
            sum2 = sum2 + i;
        }
        System.out.println("Your sum is: "+sum2);
        //No hint! what do you need to complete this task?


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Enter a string: ");
        String userinput = sc.nextLine();
        String reversed = "";

        for (int i = 0; i < userinput.length(); i++) {
            reversed = userinput.charAt(i) + reversed;
        }
        System.out.println(" ");
        System.out.println("Your input reversed: "+reversed);

    }
}

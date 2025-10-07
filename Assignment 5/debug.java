/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!!
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        factorialLoop();
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        everyOther();
        System.out.println("Problem 5");
        System.out.println("Enter a string: ");
        reverse();

        /*Examples
        System.out.println("Enter your first number to be added");
        int firstInput = sc.nextInt();
        System.out.println("Enter your second number to be added");
        int secondInput = sc.nextInt();
        //remember this method is returning, so we need to print it out
        System.out.println(add(firstInput,secondInput));

        System.out.println("im going to print out the word Dog now.");
        printDog();*/
    }

    public static void factorialLoop() {
        Scanner sc = new Scanner(System.in);
        int p2 = sc.nextInt();
        int sum = 1;
        for (int i = 1; i < p2; i++) {
            sum = sum * i;
            System.out.println("Your sum is: " + sum);
        }
    }
    public static void everyOther(){
        Scanner sc = new Scanner(System.in);
        int p3 = sc.nextInt();
        int sum2 = 0;
        for (int i = 1; i < p3; i+=2) {
            sum2 = sum2 + i;
            System.out.println("Your sum is: " + sum2);
        }
    }
    public static void reverse(){
        Scanner sc = new Scanner(System.in);
        String userinput = sc.nextLine();
        String reversed = "";
        for (int i = 0; i < userinput.length(); i++) {
            reversed = userinput.charAt(i) + reversed;
        }
        System.out.println(" ");
        System.out.println("Your input reversed: "+reversed);
    }
}

/*Example methods
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }


    public static void printDog(){
        System.out.println("Dog");
    }*/

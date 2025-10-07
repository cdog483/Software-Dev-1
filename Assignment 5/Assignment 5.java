/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it.
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        level1();
    }

    public static void level1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("OoooOooooOohh you approach a bridge, and out jumps a troll!");
        System.out.print("1. Turn around ");
        System.out.println(" ");
        System.out.println("2. Fireball");
        String troll = sc.nextLine();
        if (troll .equals("2")){
            fireball();
        } else {
            turnAround();
        }
    }

    public static void fireball(){
        System.out.println("You cast fireball!");
        System.out.println("You not only blow up the troll, but you annihilate the bridge as well.");
    }

    public static void turnAround(){
        System.out.println("You decided to turn around.");
        System.out.println("You carry on with your day like nothing ever happened.");
    }

}

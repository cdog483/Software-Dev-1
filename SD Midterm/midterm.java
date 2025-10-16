import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Used a hashmap as it clicked better in my head - having the values tied to the actual number of case makes sense to me
        Map<Integer, Integer> cases = new HashMap<>();
        cases.put(1, 80);
        cases.put(2, 65);
        cases.put(3, 150);
        cases.put(4, 70);
        cases.put(5, 20);
        cases.put(6, 40);
        cases.put(7, 110);
        cases.put(8, 25);
        cases.put(9, 45);
        cases.put(10, 60);
        cases.put(11, 55);
        cases.put(12, 15);
        cases.put(13, 30);
        cases.put(14, 140);
        cases.put(15, 130);
        cases.put(16, 95);
        cases.put(17, 5);
        cases.put(18, 90);
        cases.put(19, 100);
        cases.put(20, 120);
        cases.put(21, 50);
        cases.put(22, 75);
        cases.put(23, 85);
        cases.put(24, 35);
        cases.put(25, 10);
        cases.put(26, 25);

        //This allows for the printing of just the case numbers themselves
        Set<Integer> faces = cases.keySet();
        //Blacklist is created for when an item is removed.
        ArrayList<Integer> blacklist = new ArrayList<>();

        System.out.println("---Deal or No Deal---");
        System.out.println("Please select a case from 1-26");

        //Set-Up
        int userCase = sc.nextInt();
        //once you have user input, print out case face case value
        System.out.println("Your chosen case holds: " + cases.get(userCase));
        cases.remove(userCase);
        blacklist.add(userCase);
        //These remove the usercase from the main list so it can't be chosen again

        //Round 1
        for (int i = 1; i < 7; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
                //Prevents player from choosing a null case
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
                //Main loop of the game. All of this is repeated for each round. Only big change is the amount of cases the player can pick decreases
            }
        }
        banker(cases);

        //Round 2
        for (int i = 1; i < 6; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 3
        for (int i = 1; i < 5; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 4
        for (int i = 1; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 5
        for (int i = 1; i < 3; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 6
        for (int i = 1; i < 3; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 7
        for (int i = 1; i < 2; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
        }
        banker(cases);

        //Round 8
        for (int i = 1; i < 2; i++) {
            System.out.println(" ");
            System.out.println("Select a case to remove");
            System.out.println(faces);
            int removed = sc.nextInt();
            if (blacklist.contains(removed)) {
                System.out.println("Invalid Input");
                i--;
            } else {
                System.out.println("Your removed case: " +removed+ " which held "+ cases.get(removed));
                blacklist.add(removed);
                cases.remove(removed);
            }
            banker(cases);

        }

        //Final Case
        System.out.println(" ");
        System.out.println("The final round");
        System.out.println(" ");
        System.out.println(faces);
        System.out.println(" ");
        System.out.println("Do you want your og case, or to take the final case?");
        boolean KorN = true;
        while (KorN){
            System.out.println("Enter: 'Keep' or 'New'");
            String finalCase = sc.nextLine();
            String dummy = sc.nextLine();
            //Dummy is more or less the same variable as final case, I'm terrified of fixing it in the slim chance it somehow breaks the code
            if (dummy.equals("New")){
                System.out.println("You chose the new case, and are leaving with: "+cases);
                KorN = false;
            } else if (dummy.equals("Keep")){
                System.out.println("You chose your old case, and are leaving with: "+cases.get(userCase));
                KorN = false;
                //Tried to get it to print out the value of the chose case here, but for time decided to just stick with what I had
            } else {
                System.out.println("Not a valid input");
            }
        }
        System.out.println("Thank you for playing!");
    }



    public static double banker(Map<Integer, Integer> map) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println(" ");
        System.out.println("The banker offers you a deal of: " +Math.ceil(sum/map.size()));
        //Adds up all the remaining cases and provides the sum
        System.out.println("Do you want to take the offer and leave, or keep going? (Y)es or (N)o?");
        boolean YorN = true;
        while (YorN){
            String inputBanker = sc.nextLine();
            if (inputBanker.equals("Y")){
                System.out.println("You take "+ Math.ceil(sum/map.size()) +" as your final prize");
                YorN = false;
                System.exit(0);
                //ends game here
            } else if (inputBanker.equals("N")) {
                System.out.println("You decide to try your luck and keep going.");
                YorN = false;
                //Go back to the main loop
            } else {
                System.out.println("Not a valid input");
                //Keeps this repeating
            }
        }
        return(sum);
    }
}

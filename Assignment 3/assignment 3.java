/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms?
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name, word, or anything like that: ");
        String userinput = sc.nextLine();
        String reversed = "";
        // Having a second variable seems important as it most likely allows for the reversed text to go somewhere

        for (int i = 0; i < userinput.length(); i++) {
            reversed = userinput.charAt(i) + reversed;
        }
        System.out.println(" ");
        System.out.println("Your input reversed: "+reversed);
    }
}
/* To figure this out I mainly just followed along with what w3 schools had as their example for this problem.
Once I had an example that made sense to me, the solution made more sense. However, somethings are certainly still not entirely clear to me.
The two things I don't fully understand are .length and .charAt. However, I'm guessing that .length is looking for specifaclly the length of the string and 
 turning that into an integer.
.charAt I assume is just looking for the specific character the string ends at or somethin like that.
Other than that, the code takes the string, and reverses it by placing the characters of the string into a new string, starting with the first character and then placing the next character 
 in front of the first character in the new string.
 */

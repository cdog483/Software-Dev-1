
import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();
        //All this done to take user's input for the calculations/rest of the code

        int additionalTaxReduction = 0;
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }
        //This is set up for the next chunk of code
        //Sets up a variable so if more people are in a household, the code can calculate that better

        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else {
            System.out.println("No applicable reduction on taxes found.");
        } //Simple else if branch to tell user what their % reduction is depending on their unputs

    }
}

/*Overall, the code takes the user input and is trying to find the tax reduction precent.
This is done mainly through simple math, and then checking if the number is within a certain range using else if statements
The biggest outlier is the for loop as that is done encase a person lives with multiple people, as it has a bit more going on than just multiplication and addition


I think that this amount of commenting is reasonable as it's not too much and not too little. The code is fairly straightforward, so I don't think there needs to be
much explination on that part. There is still enough comments though to help explain what the purpose is of each segment of the code. I also added a summary as I
feel that it can be helpful to have something after the fact that helps to summarize what is happening all together as a process
 */

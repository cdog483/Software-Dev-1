public class Main {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4) {
            System.out.println("Var1 is greater than 4");
        } else if (var1 == 4) {
            System.out.println("Var1 is 4");
            // Adding this creates something to be printed for when var1 is 4 (or isn't greater or lesser than 4)
        } else {
            System.out.println("Var1 is less than 4");
            }

        int var2 = 6;
        if (var2 == 5) {
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else{
            System.out.println("Var2 is less than 5");
            //Got rid of the else/'var2 is 6' as it seemed redundant with the else if for when the number is greater than 5
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else if (var1 == 10) {
            System.out.println("Var3 is 10");
        }else{
            System.out.println("Var3 is less than 10");
            //Same as the first one, makes sense to me to have a result for when the number is 10 and not greater or less
        }


        //for this section: why are we not entering the if statement?
        if ("Marist" == "Marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }
//Changed the lowercase m to capital to get the correct print statement
    }
}

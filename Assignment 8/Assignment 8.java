import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//do you need something to start?
        File inputfile = new File("practice.txt");
        List<String> list = new ArrayList<>(); /**/
        int count = 0;
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()){
                list.add(input.nextLine()); /**/
//what do we do at every line of the file?
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < list.size(); i+=2){
            if (Double.parseDouble(list.get(i)) >= 3.5){ //parse = convert
                //Goes through list and converts the numbers into ints so it can count correctly
                System.out.println(list.get(i-1));
                count++;
                //count = count + 1;
            }
        }
        System.out.println("Students with a 3.5 or above = "+count);
/*optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println(list);*/
    }
}

//I think the biggest thing I learned in this is how to get a .txt into a list. Most of this assignment was coverting everything into a list so to make the process easier

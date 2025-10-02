 public class Main {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
        boolean[] checked = new boolean[myArray.length]; //Creates an array as a boolean as the length of myArray
        System.out.println("Duplicate numbers with their counts:");
        for (int i = 0; i < myArray.length; i++) { //runs through the array.
            if (!checked[i]) { //If variable 'checked' is false then it proceeds
                int count = 1; //Starts the count at 1, since if we're counting multiples there will always be 1
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[i] == myArray[j]) {
                        count++; //Runs through the array, but keeps track when ever a number is repeated so 'count' can be increased
                        checked[j] = true;
                    }
                }
                if (count > 1) { //if a number has a count more than 1, it prints it out and how many times it was counted
                    System.out.println(myArray[i] + " appears " + count + " times.");
                }
            }
        }
    }
}

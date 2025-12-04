/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack
3. Find the middle value of the linkedlist I created
4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;
import java.util.LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();

        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        int staxSize = stax.size();
        System.out.println(staxSize);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        list1.add(stax.pop());
        Collections.sort(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(7));

        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);
        int linkySize = linky.size();
        //System.out.println(linkySize);
        System.out.println("The middle "+linky.get(2));

        Queue<String> RCoaster = new LinkedList<>();
        RCoaster.add("Paul");
        RCoaster.add("Steve");
        RCoaster.add("May");
        RCoaster.remove();
        RCoaster.remove();
        RCoaster.remove();

    }
}

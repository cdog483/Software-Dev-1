//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Steve", "Junior",3.6,1);
        Student student2 = new Student("Bill", "Senior",3.4,6);
        Student student3 = new Student("Allie", "Sophmore",4.0,2);
        Student student4 = new Student("Ana", "Freshman",2.9,10);
        Student student5 = new Student("Thomas", "Senior",2.7,8);
        // Everything here is just set up and basically random stuff to fit the criteria

        student1.isHonors();
        student2.isHonors();
        student3.isHonors();
        student4.isHonors();
        student5.isHonors();
        //call the method with the student and their variable name - like done in class
        System.out.println(" ");

        student1.freeLunch();
        student2.freeLunch();
        student3.freeLunch();
        student4.freeLunch();
        student5.freeLunch();
        //call the 2nd method with all the free lunch stuff


    }
}

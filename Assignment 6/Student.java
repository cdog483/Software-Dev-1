import java.util.Random;

public class Student{
    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    void isHonors(){
        if (this.gpa > 3.5){
            System.out.println(this.name+" is in the honor's program");
        } else {
            System.out.println(this.name+" is not in the honor's program");
        }
    }
    void freeLunch(){
        Random random = new Random();
        int min=1;
        int max=10;
        //Sets the range at which random works
        int randomNumber = random.nextInt(max - min +1)+min;
        System.out.println("The random ID is: "+randomNumber);
        if (randomNumber == this.id){
            System.out.println("Congrats, "+this.name+"! You've won a free lunch");
        } else {
            System.out.println(this.name+" does not get a free lunch.");
        }
    }
}

public class Goblin extends Enemy{
    public Goblin(int h, int d){
        super(h, d);
    }
    //Needs constructor ^

    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
    @Override
    void attack(){
        System.out.println("The goblin goblins all over the place");
    }
}

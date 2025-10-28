public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy enemy1 = new Enemy (5,5);
        enemy1.attack();

        //create a fire and an ice wizard and call all functions
        Wizard wizardFire = new Wizard (10,15, "Fire");
        Wizard wizardIce = new Wizard (15,10, "Ice");
        Wizard wizard3 = new Wizard(10, 10,"Necromancy");
        wizardFire.damageType();
        wizardIce.damageType();
        wizard3.damageType();


        //create a goblin and call its functions
        Goblin goblin1 = new Goblin(3, 3);
        goblin1.attack();

    }
}

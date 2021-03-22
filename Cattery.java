import java.util.ArrayList;
/**
 * Write a description of class Cattery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cattery
{
    // instance variables - replace the example below with your own
    private ArrayList<Cat> teamJeffery = new ArrayList<Cat>();
    private ArrayList<Cat> teamSacha = new ArrayList<Cat>();

    /**
     * Constructor for objects of class Cattery
     */
    public Cattery()
    {
        // populate creation
        this.populateTeamJeffery();
        this.populateTeamSacha();
        
    }

    /**
     * Fill in the team
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void populateTeamJeffery() {
    
        // put your code here
        teamJeffery.add(new Cat("Garfield", 2, 128));
        teamJeffery.add(new Cat("Tom", 5, 3));
    }
    public void populateTeamSacha() {
        teamSacha.add(new Cat("Garfield", 3, 5));
        teamSacha.add(new Cat("Hello Kitty", 64, 1));
    }
    public void battle(){
        /**
         * choosing attacker and defender randomly
         */
        
        Cat attacker, defender;
        // need to put inside var because it is the way
        int attackerIdx = (int) (Math.random() * teamJeffery.size());
        int defenderIdx = (int) (Math.random() * teamSacha.size());
        
        attacker = teamJeffery.get(attackerIdx);
        defender = teamSacha.get(defenderIdx);
        
        /* get attack and deal to enemy */
        int attackAmt = attacker.getAttack();
        
        defender.takeDamage(attackAmt); // Deal attack
        
        // Defender attack back
        attacker.takeDamage(defender.getAttack());
        
        System.out.println(attacker.getName() + " deals " + attackAmt);
        System.out.println(defender.getName() + " has " + defender.getLife());
        System.out.println(attacker.getName() + " has " + attacker.getLife());
    }
    
    public static void main(String[] args) {
        Cattery c = new Cattery();
        c.battle();
    }
}


/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat
{
    private String name;
    private int attack, life;
    
    /**
     *  Constructor
     */
    public Cat(String nm, int at, int hp) {
        name = nm;
        attack = at;
        life = hp;
        
    }
    public boolean isAlive() {
        if (life <= 0)
            return false;
        return true;
    }
    public void takeDamage(int amt) {
        life -= amt;
    }
    public int getAttack() {
        return attack;
    }
    public String getName() {
        return name;
    }
    public int getLife() {
       return life; 
    }
}

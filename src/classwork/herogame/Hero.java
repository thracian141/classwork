package classwork.herogame;


public class Hero {
    @Override
    public String toString() {
        return "'s Attack="+attack + " | Defence" + defence + " | Health " + health;
    }

    public String findRemainingHealth(){
        return "remaining health: " + health;
    }

    private int attack;
    private int defence;
    private int health;

    public Hero(int attack, int defence, int health) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    public int GetAttack() {
        return attack;
    }

    public int GetDefence() {
        return defence;
    }

    public int GetHealth() {
        return health;
    }

    public void SetAttack(int attack){
        this.attack = attack;
    }

    public void SetDefence(int defence){
        this.defence = defence;
    }

    public void SetHealth(int health){
        this.health = health;
    }

    public void updateHP(int health){
        SetHealth(Math.max(health, 0));
    }
}

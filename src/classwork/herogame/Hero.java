package classwork.herogame;

public class Hero {
    protected int attack;
    protected int defence;
    protected int health;

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
}

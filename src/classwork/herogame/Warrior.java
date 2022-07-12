package classwork.herogame;

public class Warrior extends Hero {
    public Warrior(int attack, int defence, int health) {
        super(10, 10, 100);
    }

    public int GetAttack() {
        return super.GetAttack() * 2;
    }
}

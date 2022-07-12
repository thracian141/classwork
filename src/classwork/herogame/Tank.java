package classwork.herogame;

public class Tank extends Hero {
    public Tank(int attack, int defence, int health) {
        super(5, 20, 150);
    }

    public int GetAttack() {
        return (int)(super.GetAttack() * 1.5);
    }

    public int GetDefence(int attack) {
        return super.GetDefence() + (attack/2);
    }
}

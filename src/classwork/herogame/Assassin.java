package classwork.herogame;

public class Assassin extends Hero {
    public Assassin(int attack, int defence, int health) {
        super(20, 5, 80);
    }

    public int GetAttack() {
        return super.GetAttack() * 4;
    }

    public int GetDefence(int attack) {
        return super.GetDefence() + (attack/2);
    }
}

package classwork.herogame;

public class Ranger extends Hero{
    public Ranger(int attack, int defence, int health) {
        super(10, 0, 160);
    }

    public int GetAttack() {
        return (int)(super.GetAttack() * 3);
    }

    public int GetDefence(int attack) {
        return super.GetDefence() + (attack*2);
    }
}

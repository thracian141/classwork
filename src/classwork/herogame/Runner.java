package classwork.herogame;

public class Runner {
    public static void main(String[] args) {
        Assassin ivan = new Assassin(5, 5, 150);
        Ranger pesho = new Ranger(15, 0, 100);

        System.out.println("Ivan" + ivan.toString());
        System.out.println("Pesho" + pesho.toString());
        System.out.println(""); //empty line

        while (ivan.GetHealth() >= 0 && pesho.GetHealth() >= 0) {
            System.out.println("Ivan's " + ivan.findRemainingHealth());
            System.out.println("Pesho's " + pesho.findRemainingHealth());
            System.out.println(""); //empty line
            StartAttack(ivan, pesho);
        }
        if (ivan.GetHealth() <= 0) {
            System.out.println("Pesho has won!");
        } else if (pesho.GetHealth() <= 0) {
            System.out.println("Ivan has won!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void StartAttack(Hero attacker, Hero defender) {
        int realDmgAttacker = attacker.GetAttack() - defender.GetDefence();
        int realDmgDefender = defender.GetAttack() - attacker.GetDefence();

        defender.SetHealth(defender.GetHealth() - realDmgAttacker);
        attacker.SetHealth(attacker.GetHealth() - realDmgDefender);
    }
}

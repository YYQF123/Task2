import java.util.Scanner;

public class Fight {
    public void fight(Player player, Monster monster) {
        Setsth.Setattribute(player, monster);
        Attack attack = new Attack();
        while (player.getLife() != 0 && monster.getLife() != 0) {

            System.out.println("回合开始");
            System.out.println("英雄开始攻击");
            attack.playerattack(player, monster);
            attack.monsterattack(player, monster);
            System.out.println("                    ");
            Scanner scanner = new Scanner (System.in);
        }  System.out.println("***********");

    }
}

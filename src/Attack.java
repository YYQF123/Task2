import java.util.Scanner;

public class Attack implements jiekou_atk {
     @Override
     public void playerattack(Player player, Monster monster) {
         if (monster.getDef() > player.getAtk()) {
             System.out.println("玩家未能击穿护甲");
         }  else {
             if (monster.getLife() <= player.getAtk() - monster.getDef()) {
                 System.out.println("怪物已被击杀");
                 monster.setLife(0);
             }  else {
                 monster.setLife(monster.getLife() - (player.getAtk() - monster.getDef()));
                 System.out.println("怪物当前生命值为" + monster.getLife());
             }
         }
     }

        @Override
        public void monsterattack (Player player, Monster monster){
            System.out.println("怪物开始攻击");
            if (player.getDef() > monster.getAtk()) {
                System.out.println("怪物未能击穿护甲");
            } else {
                if (player.getLife() <= monster.getAtk() - player.getDef()) {
                    System.out.println("玩家已被击杀");
                    player.setLife(0);
                } else {
                    player.setLife(player.getLife() - monster.getAtk() + player.getDef());
                    System.out.println("玩家当前生命值为" + player.getLife());
                }
            }
        }
    }



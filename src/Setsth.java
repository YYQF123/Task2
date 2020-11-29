import java.util.Scanner;

public class Setsth {
    public static void Setattribute(Player player,Monster monster){
        Scanner scanner = new Scanner ( System.in );
        System.out.println("请设置英雄名称");
        String w = scanner.next();
        player . setName (w);

        System.out.println("请设置英雄攻击力");
        int x = scanner.nextInt();
        if(x <= 99 && x > 0){
            player . setAtk (x);
        }

        System.out.println( "请设置英雄防御力" );
        int y = scanner.nextInt();
        if(y <= 99 && y > 0){
            player.setDef(y);
        }
        System.out.println("请设置英雄生命值");
        int z = scanner.nextInt();
        if(z <= 999 && z > 0){
            player.setLife(z);
        }

        System.out.println("请设置怪物名称");
        String h = scanner.next();
        monster . setName (h);

        System.out.println("请设置怪物攻击力");
        int p = scanner.nextInt();
        if(p <= 99 && p > 0){
            monster . setAtk (p);
        }

        System.out.println( "请设置怪物防御力" );
        int k = scanner.nextInt();
        if(k <= 99 && k > 0){
            monster.setDef(k);
        }
        System.out.println("请设置怪物生命值");
        int i = scanner.nextInt();
        if(i<= 999 && i > 0){
            monster.setLife(i);
        }

    }
}

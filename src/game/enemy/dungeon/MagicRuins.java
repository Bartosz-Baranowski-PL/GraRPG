package game.enemy.dungeon;

import game.enemy.GiveInformacion;
import game.enemy.abstractClass.AbstractDungeon;
import game.enemy.abstractClass.AbstractEnemy;
import game.enemy.enemy.Golem;

import java.util.ArrayList;
import java.util.List;

public class MagicRuins extends AbstractDungeon {
    private List<AbstractEnemy> list;
    private final GiveInformacion giveInformacion = GiveInformacion.getInstance();

    public void listMobs(){
        list = new ArrayList<>();
        list.add(new Golem("Leśny Golem", 130, 130, 5,3));
        list.add(new Golem("Kamienny Golem", 185, 185, 8,8));
        list.add(new Golem("Mechaniczny Golem", 300, 300, 11,9));
        list.add(new Golem("Stalowy Golem", 350, 350, 9,5));
        list.add(new Golem("Magiczny Golem", 500, 500, 15,12));
        list.add(new Golem("Mirthylowy Golem", 750, 750, 30,30));

    }

    public void enemyToFight(int enemy){
        listMobs(); //to musi być, żeby dodano moby
        giveInformacion.setName(list.get(enemy).getName());
        System.out.println("Wybrano... "+list.get(enemy));
        System.out.println("Nadawanie statystyk....");
        giveValue(enemy);
        System.out.println("Nadano statystyki");
    }

    public int sizeList() {
        listMobs();
        return list.size();
    }

    public void giveValue(int enemy){
        giveInformacion.setDamage(list.get(enemy).getDamage());
        giveInformacion.setDefend(list.get(enemy).getDefend());
        giveInformacion.setLife(list.get(enemy).getLife());
        giveInformacion.setMaxLife(list.get(enemy).getMaxLife());
        giveInformacion.setName(list.get(enemy).getName());
    }
}

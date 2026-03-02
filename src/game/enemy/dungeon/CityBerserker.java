package game.enemy.dungeon;

import game.enemy.GiveInformacion;
import game.enemy.abstractClass.AbstractDungeon;
import game.enemy.abstractClass.AbstractEnemy;
import game.enemy.enemy.Berserker;

import java.util.ArrayList;
import java.util.List;

public class CityBerserker extends AbstractDungeon {
    private List<AbstractEnemy> list;
    private final GiveInformacion giveInformacion = GiveInformacion.getInstance();

    public void listMobs(){
        list=new ArrayList<>();
        list.add(new Berserker("Młody Berserker",21,21,3,7));
        list.add(new Berserker("Berserker",65,65,4,30));
        list.add(new Berserker("Zawodowy Berserker",80,80,7,45));
        list.add(new Berserker("Młody Berserker",111,111,10,60));
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

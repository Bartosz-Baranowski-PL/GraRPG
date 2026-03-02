package game.enemy.dungeon;

import game.enemy.GiveInformacion;
import game.enemy.abstractClass.AbstractDungeon;
import game.enemy.abstractClass.AbstractEnemy;
import game.enemy.enemy.Wolf;

import java.util.ArrayList;
import java.util.List;

public class TowerWolf extends AbstractDungeon {
    private List<AbstractEnemy> list;
    private final GiveInformacion giveInformacion = GiveInformacion.getInstance();

    public void listMobs(){
        list = new ArrayList<>();
        list.add(new Wolf("Wolf",30,30,5,5));
        list.add(new Wolf("Big Wolf",100,100,8,10));
        list.add(new Wolf("Smal Wolf",15,15,2,3));
        list.add(new Wolf("Dark Wolf", 150,150,12,30));
        list.add(new Wolf("Blue Wolfik", 100, 100, 10, 10));

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

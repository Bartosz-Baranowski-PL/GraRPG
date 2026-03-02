package game.enemy;

import game.enemy.dungeon.CityBerserker;
import game.enemy.dungeon.MagicRuins;
import game.enemy.dungeon.TowerWolf;

import java.util.Random;

public class RandomizeEnemy {
    private final TowerWolf towerWolf = new TowerWolf();
    private final CityBerserker cityBerserker = new CityBerserker();
    private final MagicRuins magicRuins = new MagicRuins();
    private final Random random = new Random();

    public void randomChoiceEnemy(int enemy){
        switch (enemy){
            case 1:
                int choiceTowerWolf = random.nextInt(towerWolf.sizeList());
                towerWolf.enemyToFight(choiceTowerWolf);
                break;
            case 2:
                int choiceMagicRuins = random.nextInt(magicRuins.sizeList());
                magicRuins.enemyToFight(choiceMagicRuins);
                break;
            case 3:
                int choiceCityBerserker = random.nextInt(cityBerserker.sizeList());
                cityBerserker.enemyToFight(choiceCityBerserker);
                break;
        }
    }
}

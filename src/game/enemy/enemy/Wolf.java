package game.enemy.enemy;

import game.enemy.abstractClass.AbstractEnemy;

public class Wolf extends AbstractEnemy {
    public Wolf(String name, int life, int maxLife, int defend, int damage) {
        super(name, life, maxLife, defend, damage);
    }
}

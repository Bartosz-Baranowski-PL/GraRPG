package game.enemy.abstractClass;

public class AbstractDungeon {
    private String name;
    private int level;
    private int life;
    private int maxLife;
    private int defend;
    private int damage;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getDefend() {
        return defend;
    }

    public int getDamage() {
        return damage;
    }
}

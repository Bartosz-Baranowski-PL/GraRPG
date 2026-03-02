package game.enemy.abstractClass;

public class AbstractEnemy {

    private String name;
    private int life;
    private int maxLife;
    private int defend;
    private int damage;

    public AbstractEnemy(String name, int life, int maxLife, int defend, int damage) {
        this.name = name;
        this.life = life;
        this.maxLife = maxLife;
        this.defend = defend;
        this.damage = damage;
    }

    public String getName() {
        return name;
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

    public void changeLife(int amount){
        life-=amount;
    }



    @Override
    public String toString() {
        return
                name +
                " HP: " + life +
                " maxHP: " + maxLife +
                " Deff: " + defend +
                " ATK:" + damage;
    }
}

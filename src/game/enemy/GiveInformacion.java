package game.enemy;

public class GiveInformacion {
    //klasa która ma za zadanie dać informacje do Fight
    private String name="Ustaw mnie";
    private int life;
    private int maxLife;
    private int defend;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private static GiveInformacion instance;

    private GiveInformacion(){}

    public static GiveInformacion getInstance() {
        if (instance == null) {
            instance = new GiveInformacion();
        }
        return instance;
    }
}

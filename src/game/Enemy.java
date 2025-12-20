package game;

public class Enemy {
    private static Enemy instance;

    private Enemy(){
        this.name="";
        this.level=1;
        this.life = 10;
        this.maxLife = 20;
        this.defend=1;
        this.damage = 3;
    }

    public static Enemy getInstance() {
        if (instance == null) {
            instance = new Enemy();
        }
        return instance;
    }
    private String name;
    private int level;
    private int life;
    private int maxLife;
    private int defend;
    private int damage;
    public String getName(){
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getDefend() {
        return defend;
    }

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }

    public void deadIsNotStrongForMe(){
        life=maxLife;
    }
    public int heroGiveLevel(int amount){
        level+=amount;
        return level;
    }

    public void enemyDraw(int amount){
        if (amount==1) {
            name = "The wolf of life";
            maxLife=level*7;
            life=maxLife;
            damage =level;
            defend=level+level/2+1;
        } else if (amount==2){
            name = "Golem";
            maxLife=level*20;
            life=maxLife;
            damage =level;
            defend=level*5;
        } else {
            name = "Berserker";
            maxLife=level*5+20;
            life=maxLife;
            damage =level*5;
            defend=level;
        }
    }

    public void czangeLife(int amount){
        int liveNow=life+amount;
        if (liveNow>maxLife){
            life=maxLife;
        } else if (liveNow<=0) {
            life=0;
        } else {
            life=liveNow;
        }
    }
}
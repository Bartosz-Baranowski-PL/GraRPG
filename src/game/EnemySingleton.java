package game;

public class EnemySingleton {
    private static EnemySingleton instance;

    private EnemySingleton(){
        this.name="";
        this.level=1;
        this.life = 10;
        this.maxLife = 20;
        this.defend=1;
        this.strongStat = 2;
        this.skilStat = 1;
    }

    public static EnemySingleton getInstance() {
        if (instance == null) {
            instance = new EnemySingleton();
        }
        return instance;
    }
    private String name;
    private int level;
    private int life;
    private int maxLife;
    private int defend;
    private int strongStat;
    private int skilStat;
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

    public int getStrongStat() {
        return strongStat;
    }

    public int getSkilStat() {
        return skilStat;
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
            skilStat=level*7;
            strongStat=level;
            defend=level+level/2+1;
        } else if (amount==2){
            name = "Golem";
            maxLife=level*20;
            life=maxLife;
            skilStat=level;
            strongStat=level;
            defend=level*5;
        } else {
            name = "Berserker";
            maxLife=level*5+20;
            life=maxLife;
            skilStat=level*5;
            strongStat=level*5;
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

    public int dmgInHero(){
        int dmgInHero=skilStat+strongStat;
        return dmgInHero;
    }
}
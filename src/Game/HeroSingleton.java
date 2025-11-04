package Game;

import java.util.Scanner;

public class HeroSingleton {
    private final Scanner scanner = new Scanner(System.in);

    private static HeroSingleton instance;

    private HeroSingleton() {
        this.name = "Kowal bojowy (Ty)";
        this.level = 1;
        this.experence = 0;
        this.experenceOnNextLevel = 100;
        this.life = 100;
        this.maxLife = 100;
        this.defendStat = 1;
        this.strongStat = 4;
        this.skilStat = 4;
        this.dmgInEnemy = strongStat + skilStat;
        this.money = 100;//
    }

    public static HeroSingleton getInstance() {
        if (instance == null) {
            instance = new HeroSingleton();
        }
        return instance;
    }

    //stats noFight
    private String name;
    private int level;
    private int experence;
    private int experenceOnNextLevel;
    private double money;

    //stats fight

    private int life; // ZROBIENIE MECHANIKI WALKI i innych w których bym odbieral hp
    private int maxLife;
    private int defendStat;
    private int strongStat;
    private int skilStat;
    private int dmgInEnemy;

    public int getLevel() {
        return level;
    }

    public int getExperence() {
        return experence;
    }

    public int getExperenceOnNextLevel() {
        return experenceOnNextLevel;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getDefendStat() {
        return defendStat;
    }

    public int getSkilStat() {
        return skilStat;
    }

    public int getStrongStat() {
        return strongStat;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void stats() {
        System.out.println();
        System.out.println("Statystyki wynoszą odpowiednio:");
        System.out.println("Level: " + level + " Doświadczenie: " + experence + "/" + experenceOnNextLevel);
        System.out.println("Życie: " + life + "/" + maxLife);
        System.out.println("Siła: " + strongStat);
        System.out.println("Zręczność: " + skilStat);
        System.out.println("Zadawany dmg: " + (strongStat + skilStat));
        System.out.println();
        System.out.println("Posiadane złoto: " + money);
    }

    public void name(String amount) {
        name = amount;
    }

    public void czangeMoney(double amount) {
        money += amount;
    }

    public void strongAdd(int amount) {
        strongStat = strongStat + amount;
    }

    public void skillAdd(int amount) {
        skilStat = skilStat + amount;
    }

    public void defendAdd(int amount) {
        defendStat = defendStat + amount;
    }

    public void czangeLife(int amount) {
        int liveNow = life + amount;
        if (liveNow > maxLife) {
            life = maxLife;
        } else if (liveNow <= 0) {
            life = 0;
        } else {
            life = liveNow;
        }
    }

    public void addExp(int amount) {
        experence += amount;
        System.out.println("Masz tyle doświadczenia: " + experence);

        while (experence >= experenceOnNextLevel) {
            experence -= experenceOnNextLevel;
            level++;
            experenceOnNextLevel = level * 100;
            maxLife += 10;
            life = maxLife;
            defendStat = defendStat + 2;
            strongStat = strongStat + 2;
            skilStat = skilStat + 2;
            money = money + 10000;

            boolean papierzowa = (level == 2137);
            if (papierzowa) {
                System.out.println("Gz " + level + " lvl!!! Może kremówki? Masz jeszcze 10k golda w nagrode!!!!");
            } else {
                System.out.println("Gz " + level + " lvl!!! Masz jeszcze 10k golda w nagrode!!!!");
            }
            System.out.println("Zostało " + experence + " doświadczenia.");
        }
    }

    public int dmgInEnemy() {
        return dmgInEnemy;
    }

    public void tavern() {
        if (money >= 20) {
            money = money - 20;
            life = maxLife;
            System.out.println("Zapłaciłeś 20 golda i przywróciłeś sobie maksymalne życie!!!");
        } else {
            System.out.println("Musisz mieć 20 golda, żeby opłacić karczmę!!!");
        }
    }

    public int getDmgInEnemy(){
        dmgInEnemy=skilStat+strongStat;
        return dmgInEnemy;
    }
}
package game;

public class Hero {
    private static Hero instance;

    private Hero() {
        this.name = "Kowal bojowy (Ty)";
        this.level = 1;
        this.experence = 0;
        this.experenceOnNextLevel = 100;
        this.life = 100;
        this.maxLife = 100;
        this.defend = 1;
        this.damage = 4;
        this.money = 2;
    }

    public static Hero getInstance() {
        if (instance == null) {
            instance = new Hero();
        }
        return instance;
    }

    private String name;
    private int level;
    private int experence;
    private int experenceOnNextLevel;
    private double money;
    private int life;
    private int maxLife;
    private int defend;
    private int damage;

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

    public int getDefend() {
        return defend;
    }

    public int getDamage() {
        return damage;
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
        System.out.println("Zadawany damage: " + damage);
        System.out.println();
        System.out.println("Posiadane złoto: " + money);
    }

    public void name(String amount) {
        name = amount;
    }

    public void czangeMoney(double amount) {
        money += amount;
    }

    public int damageAdd(int amount) {
        damage = damage + amount;
        return damage;
    }

    public int defendAdd(int amount) {
        defend = defend + amount;
        return defend;
    }

    public void changeLife(int amount) {
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
            defend = defend + 2;
            damage = damage + 2;
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

    public void tavern() {
        if (money >= 20) {
            money = money - 20;
            life = maxLife;
            System.out.println("Zapłaciłeś 20 golda i przywróciłeś sobie maksymalne życie!!!");
        } else {
            System.out.println("Musisz mieć 20 golda, żeby opłacić karczmę!!!");
        }
    }

    public void addDamageStat(int amount){
        int cost = 0;
        for (int i = 0; i<amount;i++){
            cost= damage * 50 + cost;
            damage++;
        }
        System.out.println("Koszt podbicia damage o "+ amount +" pkt kosztuje: "+ cost);
        damage = damage - amount;
    }

    public void addDamageStatInformation(int amount){
        int cost = 0;
        for (int i = 0; i<amount;i++){
            cost= damage * 50 + cost;
            damage++;
        }
        money = money-cost;
        if (money<0){
            System.out.println("Nie masz wystarczającej ilości złota");
            money = money+cost;
            damage = damage-amount;
        } else {
            System.out.println("Pozostało złota: " + money);
            System.out.println("Posiadany damage: " + damage);
        }
    }

    public void addDefendStat(int amount){
        int cost = 0;
        for (int i = 0; i<amount;i++){
            cost= defend * 50 + cost;
            defend++;
        }
        System.out.println("Koszt podbicia obrony o "+ amount +" pkt kosztuje: "+ cost);
        defend = defend -amount;
    }

    public void addDefendStatInformation(int amount){
        int cost = 0;
        for (int i = 0; i<amount;i++){
            cost= defend * 50 + cost;
            defend++;
        }
        money = money-cost;
        if (money<0){
            System.out.println("Nie masz wystarczającej ilości złota");
            money = money+cost;
            defend = defend-amount;
        } else {
            System.out.println("Pozostało złota: " + money);
            System.out.println("Posiadana obrona: " + defend);
        }
    }
}
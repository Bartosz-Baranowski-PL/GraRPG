package game.Test;

public abstract class AbstractTest {
    String name;

    @Override
    public String toString() {
        return "\n name=" + name +
                "\n level=" + level +
                "\n exp=" + exp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public AbstractTest(String name, int level, int exp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
    }

    int level;
    int exp;


    public void addExperence(int value){
        exp=getExp()+value;
        System.out.println("Dodano exp w ilości "+value);
        System.out.println("Level:"+getLevel()+" exp: "+getExp());
    }


}

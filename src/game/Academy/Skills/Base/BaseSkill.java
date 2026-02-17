package game.Academy.Skills.Base;

public abstract class BaseSkill {
    //Todo
    // Create logic and check it

    String name;
    int level;
    int expOnNextLevel;
    int experence;
    int cost;

    public final void Use(){
        //tu metody które muszą mieć zastosowanie
        name();

        showLevel();
        calculateNextLevelExp();
        levelAdd();
        calculateNextLevelExp();
        experence();
        missingExp();
        costSkill();

        informacionSkill();

        name();
    }

    //METODY które będą miały ciągłe zastosowane... O ile dobrze kuamm wzorzec
    protected void name(){
        System.out.println(name);
    }

    protected int showLevel(){
        System.out.println("Pokazuje level "+level);
        return level;
    }

    protected int levelAdd(){
        level++;
        return level;
    }
    protected int calculateNextLevelExp(){
        expOnNextLevel=level*100;
        System.out.println(expOnNextLevel);
        return expOnNextLevel;
    }
    protected  int experence(){
        System.out.println("Zrobić");
        return 0;
    }
    protected  int missingExp(){
        System.out.println("Zrobić");
        return 0;
    }
    protected int costSkill(){
        System.out.println("Zrobić");
        return 0;
    }
    protected  String informacionSkill(){
        System.out.println("Zrobić");
        return "";
    }
}

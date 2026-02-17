package game.Academy.Skills.Skills;

import game.Academy.Skills.Base.BaseSkill;
import game.Academy.Skills.Base.SkillCalculations;
import game.Hero;

import java.util.Scanner;

public class Blacksmithing extends BaseSkill implements SkillCalculations {
    private Scanner scanner = new Scanner(System.in);

    private String name = "Blacksmithing";

    private int level = 1;
    private int expOnNextLevel = level*100;
    private int experence = 0;
    private int cost = 1500;

    private Hero hero = Hero.getInstance();

    @Override
    public void name() {
        System.out.println("Jak zastosować logikę rodzica z danymi dziecka?");
    }

    @Override
    public int showLevel() {
        System.out.println(level);
        return level;
    }

    @Override
    public int levelAdd() {
        level++;
        System.out.println(level);
        return level;
    }

    @Override
    public int calculateNextLevelExp() {
        expOnNextLevel=level*100;
        System.out.println(expOnNextLevel);
        return expOnNextLevel;
    }

    @Override
    public int experence() {
        return 0;
    }

    @Override
    public int missingExp() {
        return 0;
    }

    @Override
    public int costSkill() {
        return 0;
    }

    @Override
    public String informacionSkill() {
        return "";
    }
}

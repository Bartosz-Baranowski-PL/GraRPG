package game.Academy.Skills.Skills;

import game.Hero.Hero;

import java.util.Scanner;

public class Minning {
    private Scanner scanner = new Scanner(System.in);

    private final String name = "Mining";

    private int level = 0;
    private int experenceOnNextLevel = level * 100+100;
    private int experenceSkill = 0;
    private int cost = 1500;

    private static Minning instance;

    public static Minning getInstance() {
        if (instance == null) {
            instance = new Minning();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperenceOnNextLevel() {
        return experenceOnNextLevel;
    }

    public int getExperenceSkill() {
        return experenceSkill;
    }

    public int getCost() {
        return cost;
    }







    @Override
    public String toString() {
        return
                "\nNazwa: " + name +
                        "\nLevel: " + level +
                        "\nDoświadczenie: " + experenceSkill+"/"+experenceOnNextLevel+
                "\n Musisz wykupić podręcznnik do mnie";

    }
}
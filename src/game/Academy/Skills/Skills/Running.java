package game.Academy.Skills.Skills;

import game.Hero.Hero;

import java.util.Scanner;

public class Running{
    private Scanner scanner = new Scanner(System.in);

    private String name = "Running";

    private int level = 1;
    private int experenceOnNextLevel = 100;
    private int experenceSkill=20;

    private static Running instance;

    public static Running getInstance() {
        if (instance == null) {
            instance = new Running();
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

    @Override
    public String toString() {
        return
                "\nNazwa: " + name +
                        "\nLevel: " + level +
                        "\nDoświadczenie: " + experenceSkill+"/"+experenceOnNextLevel+
                        "\n Musisz wykupić podręcznnik do mnie";

    }
}

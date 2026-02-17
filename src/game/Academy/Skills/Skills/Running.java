package game.Academy.Skills.Skills;

import game.Academy.Skills.Base.BaseSkill;
import game.Hero;

import java.util.Scanner;

public class Running{
    private Scanner scanner = new Scanner(System.in);

    private String name = "Running";

    private int level = 0;
    private int experenceOnNextLevel = 100;
    private int experenceSkill=20;

    private Hero hero = Hero.getInstance();
}

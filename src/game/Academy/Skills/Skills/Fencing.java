package game.Academy.Skills.Skills;

import game.Academy.Skills.Base.BaseSkill;
import game.Hero;

import java.util.Scanner;

public class Fencing {
    private Scanner scanner = new Scanner(System.in);

    private String name = "Fencing";

    private int level = 0;
    private int expOnNextLevel = 100;
    private int experence = 0;
    private int cost = 1500;

    private Hero hero = Hero.getInstance();

}

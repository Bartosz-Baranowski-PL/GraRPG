package game.academy.skills.skills;

import game.academy.skills.abstractClass.SkillsAbstract;

public class Fencing extends SkillsAbstract {
    private static Fencing instance;

    public static Fencing getInstance() {
        if (instance == null) {
            instance = new Fencing("Fencing",1,100,0,1500);
        }
        return instance;
    }

    public Fencing(String name, int level, int experenceOnNextLevel, int experenceSkill, int cost) {
        super(name, level, experenceOnNextLevel, experenceSkill, cost);
    }
}

package game.Academy.Skills;

import game.Academy.Skills.Skills.Blacksmithing;
import game.Academy.Skills.Skills.Fencing;
import game.Academy.Skills.Skills.Minning;
import game.Academy.Skills.Skills.Running;

import java.util.ArrayList;
import java.util.List;

public class SkillList {
    private final List list;
    private final Blacksmithing blacksmithing = Blacksmithing.getInstance();
    private final Fencing fencing = Fencing.getInstance();
    private final Minning minning = Minning.getInstance();
    private final Running running = Running.getInstance();

    public SkillList(){
        list = new ArrayList<>();
        list.add(Blacksmithing.getInstance());
        list.add((Fencing.getInstance()));
        list.add((Minning.getInstance()));
        list.add((Running.getInstance()));
    }

    public void showList(){
        System.out.println(list);
    }



}

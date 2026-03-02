package game.academy.skills.abstractClass;

public class SkillsAbstract {
    private String name;
    private int level;
    private int experenceOnNextLevel;
    private int experenceSkill;
    private int cost;



    public SkillsAbstract(String name, int level, int experenceOnNextLevel, int experenceSkill, int cost) {
        this.name = name;
        this.level = level;
        this.experenceOnNextLevel = experenceOnNextLevel;
        this.experenceSkill = experenceSkill;
        this.cost = cost;
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

    public void addExperence(int value) {
        experenceSkill += value;
        if (experenceSkill >= experenceOnNextLevel) {
            level++;
            experenceOnNextLevel = level * 100;
            System.out.println("Właśnie awansowałeś umiejętność!!! Ma teraz " + level + " level" +
                    "\n Wbite doświadczenie/wymagane doświadczenie --> " + experenceSkill + "/" + experenceOnNextLevel);
        } else {
            System.out.println(experenceSkill);
        }
    }

    public void showExpLevelSkill(){
        System.out.println(getName()+
                "\nPoziom: "+getLevel()+" Doświadczenie: "+experenceSkill+"/"+experenceOnNextLevel);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                "\n level=" + level +
                "\n experenceOnNextLevel=" + experenceOnNextLevel +
                "\n experenceSkill=" + experenceSkill +
                "\n cost=" + cost +
                '}';
    }
}

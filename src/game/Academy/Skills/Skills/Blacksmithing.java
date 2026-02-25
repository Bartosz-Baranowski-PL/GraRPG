package game.Academy.Skills.Skills;


public class Blacksmithing {
    private final String name = "Blacksmithing";
    private int level = 1;
    private int experenceOnNextLevel = level * 100+100;
    private int experenceSkill = 0;

    private static Blacksmithing instance;

    public static Blacksmithing getInstance() {
        if (instance == null) {
            instance = new Blacksmithing();
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

    public void addExperence(int value) {
        experenceSkill += value;
        if (experenceSkill >= experenceOnNextLevel) {
            level++;
            experenceOnNextLevel = level * 100;
            System.out.println("Właśnie awansowałeś umiejętność!!! Ma teraz " + level + " level" +
                    "\n Wbite doświadczenie/wymagane doświadczenie --> " + experenceSkill + "/" + experenceOnNextLevel);
        } else {
            showExpLevelSkill();
        }
    }

    public void showExpLevelSkill(){
        System.out.println(getName()+
                "\nPoziom: "+getLevel()+" Doświadczenie: "+experenceSkill+"/"+experenceOnNextLevel);
    }

    @Override
    public String toString() {
        return
                "\nNazwa: " + name +
                "\nLevel: " + level +
                "\nDoświadczenie: " + experenceSkill+"/"+experenceOnNextLevel;

    }
}

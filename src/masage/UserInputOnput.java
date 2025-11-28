package masage;

import game.HeroSingleton;

public class UserInputOnput {
    private final HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private int trainingCostStrong = heroSingleton.getStrongStat() * 50;
    private int trainingCostSkill = heroSingleton.getSkilStat() * 50;
    private int trainingCostDefend = heroSingleton.getDefendStat() * 50;

    public void choiseOnput(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nCo teraz zamierzasz zrobić");
        sb.append("\n 1. Iść zdobyć Dungeuron!!!");
        sb.append("\n 2. Idziesz szukać pracy."); //zrandomizuj
        sb.append("\n 3. Idziesz do szkoły poprawić swoje parametry.");//dodaj petle 5/10/maks itp itd)
        sb.append("\n 4. A może by tak się najeść? To jest to!!! (idziesz do karczmy");
        sb.append("\n 5. Sprawdz swoje statystyki oraz ekwipunek");
        sb.append("\n Inna cyfra wyłącza grę\n");
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nTwój wybór to...:");
        System.out.println(sb);
    }
    public void academyMsg(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n Jaką statystykę chcesz ulepszyć? Posiadasz " + heroSingleton.getMoney() + " golda.\n");
        sb.append("\n 1. Siłe za " + heroSingleton.getStrongStat() * 50 + " golda? (Dodaje 1 pkt siły)");
        sb.append("\n 2. Zręczność za " + heroSingleton.getSkilStat() * 50 + " golda? (Dodaje 1 pkt zręczności)");
        sb.append("\n 3. Obronę za " + heroSingleton.getDefendStat() * 50 + " golda? (Dodaje 1 pkt OBRONY)");
        sb.append("\n Inna cyfra - wyjście\n");
        System.out.println(sb);
    }
    public void run(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n *___Wstęp___* \n");
        sb.append("Jakie jest Twoje miano?");
        System.out.println(sb);
    }
}

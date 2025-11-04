package Game;

import java.util.Scanner;

public class Academy {
    private HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private Scanner scanner = new Scanner(System.in);

    public void learning(){
    boolean learn = true;
        while (learn) {
        System.out.println();
        System.out.println("Jaką statystykę chcesz ulepszyć? Posiadasz " + heroSingleton.getMoney() + " golda.");
        System.out.println("1. Siłe za " + heroSingleton.getStrongStat() * 50 + " golda? (Dodaje 1 pkt siły)");
        System.out.println("2. Zręczność za " + heroSingleton.getSkilStat() * 50 + " golda? (Dodaje 1 pkt zręczności)");
        System.out.println("3. Obronę za " + heroSingleton.getDefendStat() * 50 + " golda? (Dodaje 1 pkt OBRONY)");
        System.out.println("Inna cyfra - wyjście");
        System.out.println();

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                if (heroSingleton.getMoney() >= (heroSingleton.getStrongStat() * 50)) {
                    heroSingleton.czangeMoney(-heroSingleton.getStrongStat()*50);
                    heroSingleton.strongAdd(1);
                    System.out.println("Masz teraz " + heroSingleton.getStrongStat() + " siły oraz " + heroSingleton.getMoney() + " golda");
                } else {
                    System.out.println("Nie masz wystarczająco golda!!!");
                }
                break;
            case 2:
                if (heroSingleton.getMoney() >= (heroSingleton.getSkilStat() * 50)) {
                    heroSingleton.czangeMoney(-heroSingleton.getSkilStat()*50);
                    heroSingleton.skillAdd(1);
                    System.out.println("Masz teraz " + heroSingleton.getSkilStat() + " zręczności oraz " + heroSingleton.getMoney() + " golda");
                } else {
                    System.out.println("Nie masz wystarczająco golda!!!");
                }
                break;
            case 3:
                if (heroSingleton.getMoney() >= (heroSingleton.getDefendStat() * 50)) {
                    heroSingleton.czangeMoney(-heroSingleton.getDefendStat()*50);
                    heroSingleton.defendAdd(1);
                    System.out.println("Masz teraz " + heroSingleton.getDefendStat() + " obrony oraz " + heroSingleton.getMoney() + " golda");
                } else {
                    System.out.println("Nie masz wystarczająco golda!!!");
                }
                break;
            default:
                System.out.println();
                System.out.println("Czy na pewno chcesz wyjść?");
                System.out.println("1. Tak");
                System.out.println("Inna cyfra - nie");
                System.out.println();
                int learnCheck = scanner.nextInt();
                boolean learnNext = learnCheck==1;
                if (learnNext) {
                    learn = false;
                }
                break;
        }
    }

}
}

package game;

import masage.UserInputOnput;

import java.util.Scanner;

public class Academy {
    private final HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private final Scanner scanner = new Scanner(System.in);
    private UserInputOnput userInputOnput = new UserInputOnput();

    private int trainingCostStrong = heroSingleton.getStrongStat() * 50;
    private int trainingCostSkill = heroSingleton.getSkilStat() * 50;
    private int trainingCostDefend = heroSingleton.getDefendStat() * 50;

    public void learning() {
        if (heroSingleton.getMoney() >= trainingCostDefend || heroSingleton.getMoney() >=trainingCostSkill || heroSingleton.getMoney() >=trainingCostStrong) {
            boolean learn = true;
            while (learn) {
                userInputOnput.academyMsg();
                int choise = scanner.nextInt();
                switch (choise) {
                    case 1:
                        if (heroSingleton.getMoney() >= (heroSingleton.getStrongStat() * 50)) {
                            heroSingleton.czangeMoney(-heroSingleton.getStrongStat() * 50);
                            heroSingleton.strongAdd(1);
                            System.out.println("Masz teraz " + heroSingleton.getStrongStat() + " siły oraz " + heroSingleton.getMoney() + " golda");
                        } else {
                            System.out.println("Nie masz wystarczająco golda!!!");
                        }
                        break;
                    case 2:
                        if (heroSingleton.getMoney() >= (heroSingleton.getSkilStat() * 50)) {
                            heroSingleton.czangeMoney(-heroSingleton.getSkilStat() * 50);
                            heroSingleton.skillAdd(1);
                            System.out.println("Masz teraz " + heroSingleton.getSkilStat() + " zręczności oraz " + heroSingleton.getMoney() + " golda");
                        } else {
                            System.out.println("Nie masz wystarczająco golda!!!");
                        }
                        break;
                    case 3:
                        if (heroSingleton.getMoney() >= (heroSingleton.getDefendStat() * 50)) {
                            heroSingleton.czangeMoney(-heroSingleton.getDefendStat() * 50);
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
                        boolean learnNext = learnCheck == 1;
                        if (learnNext) {
                            learn = false;
                        }
                        break;
                }
            }
        }
        System.out.println();
        System.out.println("Nie masz wystarczającej ilości golda na naukę");
        System.out.println();
    }
}

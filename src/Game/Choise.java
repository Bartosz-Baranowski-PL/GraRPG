package Game;

import java.util.Scanner;

public class Choise {
    private final Scanner scanner = new Scanner(System.in);

    private final HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private final DungeonManager dungeonManager = new DungeonManager();
    private final JobsManager jobsManager = new JobsManager();
    private final Academy academy = new Academy();

    public void run() {
        System.out.println();
        System.out.println("*___Wstęp___*");
        System.out.println();
        System.out.println("Jakie jest Twoje miano?");
        String name = scanner.next();
        heroSingleton.name(name);

        boolean gameRun = true;
        while (gameRun) {
            System.out.println();
            System.out.println("------MENU------");
            System.out.println("Co teraz zamierzasz zrobić?");
            System.out.println("1. Iść zdobyć Dangeuron!!!"); //jest
            System.out.println("2. Idziesz szukasz pracy."); //do zrobienia, może zrandomizować
            System.out.println("3. Idziesz do szkoły poprawić swoje parametry."); //do zrobienia
            System.out.println("4. A może by tak się najeść? To jest to!!! (idziesz do karczmy"); //do zrobienia
            System.out.println("5. Sprawdz swoje statystyki oraz ekwipunek");
            System.out.println("Inna cyfra wyłącza grę");
            System.out.println("------MENU------");


            System.out.println("Twój wybór to...: ");
            int choiseStart = scanner.nextInt();

            switch (choiseStart) {
                case 1:
                    dungeonManager.dungeon();
                    //nie mam pomysłu jak to leepiej zrobić
                    boolean isLive = heroSingleton.getLife()>0;
                    if (!isLive){
                        gameRun=false;
                    }
                    break;
                case 2:
                    jobsManager.offerJobs();
                    break;
                case 3:
                    academy.learning();
                    //rozwin tez opcje dodawania więcej niż 1 staty
                    break;//tu może jeszcze umki będą
                case 4:
                    heroSingleton.tavern();
                    break;//może tu jeszcze dodaj jakiejś wyzwania albo opcje hazardu...
                case 5:
                    heroSingleton.stats();
                    break;
                default:
                    gameRun=false;
                    break;
            }
        }
    }
}
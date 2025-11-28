import game.Academy;
import game.DungeonManager;
import game.HeroSingleton;
import jobs.JobsRandomizer;
import masage.UserInputOnput;

import java.util.Scanner;

public class Choise {
    private final Scanner scanner = new Scanner(System.in);
    private final HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private final DungeonManager dungeonManager = new DungeonManager();
    JobsRandomizer jobsRandomizer = new JobsRandomizer();
    private final Academy academy = new Academy();
    private UserInputOnput msg = new UserInputOnput();

    public void run() {
        msg.run();
        String name = scanner.nextLine();
        heroSingleton.name(name);

        boolean gameRun = true;
        while (gameRun) {
            msg.choiseOnput();
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
                    jobsRandomizer.sprawdzienie();
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
import User.UserInputOnput;
import game.Academy;
import game.Dungeon;
import game.Hero;
import jobs.JobsRandomizer;

import java.util.Scanner;

public class Choice {
    private final Scanner scanner = new Scanner(System.in);
    private final Hero hero = Hero.getInstance();
    private final Dungeon dungeon = new Dungeon();
    private final JobsRandomizer jobsRandomizer = new JobsRandomizer();
    private final Academy academy = new Academy();
    private final UserInputOnput userInputOnput = new UserInputOnput();

    public void run() {
        userInputOnput.run();
        String name = scanner.nextLine();
        hero.name(name);

        boolean gameRun = true;
        while (gameRun) {
            userInputOnput.choiseOnput();
            int choiceStart = scanner.nextInt();

            switch (choiceStart) {
                case 1:
                    dungeon.dungeon();
                    if (hero.getLife()<=0){
                        gameRun=false;
                    }
                    break;
                case 2:
                    jobsRandomizer.test();
                    break;
                case 3:
                    academy.learning();
                    break;
                case 4:
                    hero.tavern();
                    break;
                case 5:
                    hero.stats();
                    break;
                default:
                    System.out.println("Gra została zakończona");
                    gameRun=false;
                    break;
            }
        }
    }
}
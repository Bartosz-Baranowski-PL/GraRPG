import static java.lang.System.out;

import user.UserInputOnput;
import game.Academy;
import game.Dungeon;
import game.Hero;
import jobs.JobsRandomizer;

import java.util.Scanner;

public class Choice {

    private final Scanner scanner = new Scanner(System.in);
    private final Hero hero = Hero.getInstance();
    private final JobsRandomizer jobsRandomizer = new JobsRandomizer();
    private final Academy academy = new Academy();
    private final UserInputOnput userInputOnput = new UserInputOnput(); // Literówka w nazwie klasy, powinno być: UserInputOutput

    public void run() {
        userInputOnput.run();

        out.print("Podaj imię bohatera: ");
        hero.name(scanner.nextLine());

        boolean gameRunning = true;

        while (gameRunning) {
            userInputOnput.choiseOnput();

            int choice = readInt();
            MenuOption option = MenuOption.fromNumber(choice);

            switch (option) {
                case DUNGEON:
                    new Dungeon().dungeon();
                    if (hero.getLife() <= 0) {
                        gameRunning = false;
                    }
                    break;

                case JOB: // Dzięki takiemu używaniu enum nie będzie zgłaszane potencjalne ostrzeżenie "Magic number" za pomocą narzędzi do sprawdzania jakości kodu.
                    jobsRandomizer.test();
                    break;

                case ACADEMY:
                    academy.learning();
                    break;

                case TAVERN:
                    hero.tavern();
                    break;

                case STATS:
                    hero.stats();
                    break;

                case EXIT:
                default:
                    out.println("Gra została zakończona.");
                    gameRunning = false;
                    break;
            }
        }
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            out.println("Wprowadź poprawny numer.");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // czyszczenie bufora
        return value;
    }

    private enum MenuOption {
        DUNGEON(1),
        JOB(2),
        ACADEMY(3),
        TAVERN(4),
        STATS(5),
        EXIT(0);

        private final int number;

        MenuOption(int number) {
            this.number = number;
        }

        public static MenuOption fromNumber(int number) {
            for (MenuOption option : values()) {
                if (option.number == number) {
                    return option;
                }
            }
            return EXIT;
        }
    }
}

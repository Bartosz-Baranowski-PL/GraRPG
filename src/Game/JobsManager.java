package Game;

import java.util.Random;
import java.util.Scanner;

public class JobsManager {
    HeroSingleton heroSingleton = HeroSingleton.getInstance();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    public void offerJobs() {
        boolean jobsTrue = true;
        while (jobsTrue) {
            System.out.println();
            System.out.println("Na tablicy ogłoszeń widać: (ostrzeżenie - istnieje mała szansa, że nie zarobisz i utracisz część hp)");
            System.out.println("1. Przyjmę do ochrony pastwiska przed wilkami");
            System.out.println("2. Szukam do pomocy w pilnowaniu wesela");
            System.out.println("3. Ochrona transportu na wczoraj!!!");
            System.out.println("4. Praca w straży miejskiej.");
            System.out.println("Inna cyfra - Jednak nie wybierasz pracy");
            System.out.println();
            int czyZarobił = random.nextInt(10) + 1;
            int choiseJob = scanner.nextInt();
            switch (choiseJob) {// Może jakiejś losowanie można by było zrobić
                case 1:
                    System.out.println("Wybrałes ochronę pastwiska. Pamiętaj tylko, że nie każde psowate jest przyjazne!!!");

                    if (czyZarobił > 1) {
                        heroSingleton.czangeMoney(1200);
                        System.out.println();
                        System.out.println("Gratulacje!!! Pastwisko zostało dobrze przypilnowane!!! Zarobiłeś 1200 golda!!!. Posiadasz teraz " + heroSingleton.getMoney() + " golda!!!");

                    } else {
                        heroSingleton.czangeLife(-20);
                        System.out.println();
                        System.out.println("Zostałeś pogryziony i straciłeś część hp oraz wypłatę!!! Zostało Ci " + heroSingleton.getLife() + "/" + heroSingleton.getMaxLife() + " hp");

                    }
                    break;
                case 2:
                    if (czyZarobił > 1) {
                        heroSingleton.czangeMoney(1500);
                        System.out.println();
                        System.out.println("Wesele się udało. Zarobiłeś 1500golda. Teraz masz " + heroSingleton.getMoney() + " golda.");
                    } else {
                        heroSingleton.czangeLife(-20);
                        System.out.println();
                        System.out.println("Na weselu było kilku upitów osiłków, którzy Ciebie pobili. Straciłeś wypłatę i część hp. Zostało Ci " + heroSingleton.getLife() + "/" + heroSingleton.getMaxLife() + " hp");
                    }
                    break;
                case 3:
                    if (czyZarobił > 1) {
                        heroSingleton.czangeMoney(1750);
                        System.out.println();
                        System.out.println("Transport bezpiecznie dodarł do celu, więc dostałeś 1750 golda. Masz teraz " + heroSingleton.getMoney() + " golda.");
                    } else {
                        heroSingleton.czangeLife(-20);
                        System.out.println();
                        System.out.println("Zeszła lawina i po transporcie. Ledwo uszedłeś spod lawiny... Zostało Ci " + heroSingleton.getLife() + "/" + heroSingleton.getMaxLife() + " hp");
                    }
                    break;
                case 4:
                    if (czyZarobił > 1) {
                        heroSingleton.czangeMoney(1100);
                        System.out.println();
                        System.out.println("Podczas obchodów nic się nie wydarzyło, więc zarobiłeś 1100 golda. Teraz masz " + heroSingleton.getMoney() + " golda.");
                    } else {
                        heroSingleton.czangeLife(-20);
                        System.out.println();
                        System.out.println("Podczas obchodów zaatakowały gobliny i uszczodziły część zabudowań + Ciebie, więc jesteś stratny. Zostało Ci " + heroSingleton.getLife() + "/" + heroSingleton.getMaxLife() + " hp");
                    }
                    break;
                default:
                    System.out.println("Idziesz poszukać innego zajęcia");
                    System.out.println();
                    jobsTrue = false;
                    break;
            }
        }
    }
}

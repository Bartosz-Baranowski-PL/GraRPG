package game.Academy;

import game.Hero.Hero;

import java.util.Scanner;

public class Stats {
    private final Hero hero = Hero.getInstance();
    private final Scanner scanner = new Scanner(System.in);


    public void learning() {
        System.out.println("Masz "+ hero.getMoney()+" złota");
        System.out.println();
        hero.addDamageStat(1);
        hero.addDamageStat(5);
        hero.addDefendStat(1);
        hero.addDefendStat(5);
        System.out.println("\nKtórą opcję wybierasz?"+
        "\n1. Dodanie 1 pkt siły"+
        "\n2. Dodanie 5 pkt siły"+
        "\n3. Dodanie 1 pkt obrony"+
        "\n4. Dodanie 5 pkt obrony"+
        "\n5. Uznajesz, że jednak nie chcesz podwyższać swoich statystyk"+
        "\n");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> hero.addDamageStatInformation(1);
            case 2 -> hero.addDamageStatInformation(5);
            case 3 -> hero.addDefendStatInformation(1);
            case 4 -> hero.addDefendStatInformation(5);
            case 5 -> System.out.println("Wychodzisz z Akademii");
            default -> System.out.println("Wybrałeś złą opcję");
        }
    }
}

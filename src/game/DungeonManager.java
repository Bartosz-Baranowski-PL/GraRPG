package game;

import java.util.Random;
import java.util.Scanner;

public class DungeonManager {
    private HeroSingleton heroSingleton = HeroSingleton.getInstance();
    private EnemySingleton enemySingleton = EnemySingleton.getInstance();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);


    public void dungeon() {
        //(POMYSŁ) dangeuron*10 mobów ma być, wtedy każdy poziom łużej będzie trwać + moby i tak będą silniejsze

        boolean warIsBrutal = true;

        int levelDangeuron = 1;
        enemySingleton.heroGiveLevel(levelDangeuron);
        // może by tak dodać kilka dangeuronów, żeby szybciej expić postać
        System.out.println();
        System.out.println("-----Dungeon Monster's-----");
        System.out.println("Gratulacje!!! Piętro " + levelDangeuron + " dungeon'u zostało rozpoczęte!!!");

        int enemyRandom = random.nextInt(3) + 1;
        enemySingleton.enemyDraw(enemyRandom); //to powinno wybierać rpzeciwnika
        System.out.println();


        while (warIsBrutal) {
            System.out.println("-----Wynik walki "+heroSingleton.getName()+heroSingleton.getLife()+"/"+heroSingleton.getMaxLife()+"/"
                    +heroSingleton.getStrongStat()+"/"+heroSingleton.getSkilStat()+"/"
                    +heroSingleton.getDefendStat()+" z "+enemySingleton.getName()+"  "
                    +enemySingleton.getLife()+"/"+enemySingleton.getMaxLife()+"/"
                    +enemySingleton.getStrongStat()+"/"+enemySingleton.getSkilStat()+"/"+enemySingleton.getDefend()+"-----");
            System.out.println("Pozostało Ci " + heroSingleton.getLife()+"/"+heroSingleton.getMaxLife() + " życia. Przeciwnik ma " + enemySingleton.getLife() + "/" + enemySingleton.getMaxLife() + " życia.");
            System.out.println();
            System.out.println("Co zamierzasz zrobić?");
            System.out.println("1. Zaatakować? Robi się!!!");
            System.out.println("2. Odpocząć? A w sumie czemu nie, odrobina życia zawsze się przyda :D");
            System.out.println("Inna cyfra -  Run Forest! RUUUUN!!! (Ucieczka to jest to!!!)");
            System.out.println();

            int checkChoise = scanner.nextInt();
            int dmgHero = heroSingleton.getDmgInEnemy() - enemySingleton.getDefend();

            if (dmgHero < 0) {
                dmgHero = 0;
            } else {
                dmgHero = heroSingleton.getDmgInEnemy() - enemySingleton.getDefend();
            }

            int dmgEnemy = enemySingleton.dmgInHero() - heroSingleton.getDefendStat();

            if (dmgEnemy < 0) {
                dmgEnemy = 0;
            } else {
                dmgEnemy = enemySingleton.dmgInHero() - heroSingleton.getDefendStat();
            }

            switch (checkChoise) {
                case 1://trzeba jedynie zrandoizowac dmg, żeby było bardziej nieprzeidywalne + zbalansuj atk/deff
                    enemySingleton.czangeLife(-dmgHero);

                    if (enemySingleton.getLife() > 0) {
                        System.out.println();

                        if (dmgHero==0){
                            System.out.println("Poćwicz swą siłę i zręczność, żeby podnieść swój dmg!!!");
                        } else {
                            System.out.println("Zadałeś "+dmgHero+" pkt obrażeń");
                        }
                        System.out.println();
                        heroSingleton.czangeLife(-dmgEnemy);

                        if (heroSingleton.getLife() > 0) {
                            System.out.println("Otrzymałeś " + dmgEnemy + " pkt obrażeń.");
                            System.out.println();
                        } else {
                            System.out.println("Przeciwnik zadał " + dmgEnemy + " pkt obrażeń.");
                            System.out.println("Otrzymałeś śmiertelny cios. Kończymy grać!!!");
                            warIsBrutal=false;
                            break;
                        }
                    } else {
                        System.out.println("Gratulacje!!! Zadałeś ostateczny cios!!! Zdobywasz 50 doświadczenia oraz łup - 1000 golda");

                        heroSingleton.addExp(50);
                        heroSingleton.czangeMoney(1000);
                        enemySingleton.deadIsNotStrongForMe();
                        heroSingleton.stats();
                        enemySingleton.enemyDraw(random.nextInt(3) + 1);
                        for (int i = 0; i < 1; i++) {
                            levelDangeuron = levelDangeuron + 1;
                        }
                        enemySingleton.heroGiveLevel(levelDangeuron);
                        //może tu dać wybur czy wraca do domu czy idzie dalej? Oczywiście lvl dangeronu zostaje
                        System.out.println("Bitwa na " + levelDangeuron + " piętrze dungeonu została rozpoczęta!!!");
                        System.out.println();
                    }
                    break;
                case 2:
                    heroSingleton.czangeLife(20);
                    System.out.println("Odpoczynek dał Ci 20hp. Masz teraz "+heroSingleton.getLife()+"/"+heroSingleton.getMaxLife()+" hp.");

                    System.out.println("Otrzymałeś " + dmgEnemy + " pkt obrażeń.");
                    heroSingleton.czangeLife(-dmgEnemy);
                    if (heroSingleton.getLife() <= 0) {
                        System.out.println("Otrzymałeś śmiertelny cios. Kończymy grać!!!");
                        warIsBrutal=false;
                        break;
                    } else {
                        System.out.println("Zostało Ci "+heroSingleton.getLife()+"/"+heroSingleton.getMaxLife()+" hp.");
                    }
                    System.out.println();
                    break;
                default:
                    warIsBrutal=false;
                    break;
            }
        }
    }
}

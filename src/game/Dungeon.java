package game;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    private final Hero hero = Hero.getInstance();
    private final Enemy enemy = Enemy.getInstance();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);


    public void dungeon() {
        boolean warIsBrutal = true;

        int levelDangeuron = 1;
        enemy.heroGiveLevel(levelDangeuron);
        System.out.println();
        System.out.println("-----Dungeon Monster's-----");
        System.out.println("Gratulacje!!! Piętro " + levelDangeuron + " dungeon'u zostało rozpoczęte!!!");

        int enemyRandom = random.nextInt(3) + 1;
        enemy.enemyDraw(enemyRandom);
        System.out.println();

        while (warIsBrutal) {
            System.out.println("-----Wynik walki "+ hero.getName()+ hero.getLife()+"/"+ hero.getMaxLife()+"/"
                    + hero.getDamage()+"/"
                    + hero.getDefend()+" z "+ enemy.getName()+"  "
                    + enemy.getLife()+"/"+ enemy.getMaxLife()+"/");
            System.out.println("Pozostało Ci " + hero.getLife()+"/"+ hero.getMaxLife() +
                    " życia. Przeciwnik ma " + enemy.getLife() + "/" + enemy.getMaxLife() + " życia.");
            System.out.println();
            System.out.println("Co zamierzasz zrobić?");
            System.out.println("1. Zaatakować? Robi się!!!");
            System.out.println("2. Odpocząć? A w sumie czemu nie, odrobina życia zawsze się przyda :D");
            System.out.println("Inna cyfra -  Run Forest! RUUUUN!!! (Ucieczka to jest to!!!)");
            System.out.println();

            int checkChoise = scanner.nextInt();
            int dmgHero = hero.getDamage() - enemy.getDefend();

            if (dmgHero < 0) {
                dmgHero = 0;
            } else {
                dmgHero = hero.getDamage() - enemy.getDefend();
            }

            int dmgEnemy = enemy.getDamage() - hero.getDefend();

            if (dmgEnemy < 0) {
                dmgEnemy = 0;
            } else {
                dmgEnemy = enemy.getDamage() - hero.getDefend();
            }

            switch (checkChoise) {
                case 1:
                    enemy.czangeLife(-dmgHero);

                    if (enemy.getLife() > 0) {
                        System.out.println();

                        if (dmgHero==0){
                            System.out.println("Poćwicz swą siłę i zręczność, żeby podnieść swój dmg!!!");
                        } else {
                            System.out.println("Zadałeś "+dmgHero+" pkt obrażeń");
                        }
                        System.out.println();
                        hero.changeLife(-dmgEnemy);

                        if (hero.getLife() > 0) {
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

                        hero.addExp(50);
                        hero.czangeMoney(1000);
                        enemy.deadIsNotStrongForMe();
                        hero.stats();
                        enemy.enemyDraw(random.nextInt(3) + 1);
                        for (int i = 0; i < 1; i++) {
                            levelDangeuron = levelDangeuron + 1;
                        }
                        enemy.heroGiveLevel(levelDangeuron);
                        System.out.println("Bitwa na " + levelDangeuron + " piętrze dungeonu została rozpoczęta!!!");
                        System.out.println();
                    }
                    break;
                case 2:
                    hero.changeLife(20);
                    System.out.println("Odpoczynek dał Ci 20hp. Masz teraz "+
                            hero.getLife()+"/"+ hero.getMaxLife()+" hp.");

                    System.out.println("Otrzymałeś " + dmgEnemy + " pkt obrażeń.");
                    hero.changeLife(-dmgEnemy);
                    if (hero.getLife() <= 0) {
                        System.out.println("Otrzymałeś śmiertelny cios. Kończymy grać!!!");
                        warIsBrutal=false;
                        break;
                    } else {
                        System.out.println("Zostało Ci "+ hero.getLife()+"/"+ hero.getMaxLife()+" hp.");
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

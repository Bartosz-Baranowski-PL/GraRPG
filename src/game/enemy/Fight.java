package game.enemy;

import game.hero.Hero;

import java.util.Random;
import java.util.Scanner;

public class Fight {
    private final Hero hero = Hero.getInstance();
    private final GiveInformacion giveInformacion = GiveInformacion.getInstance();
    RandomizeEnemy randomizeEnemy = new RandomizeEnemy();

    private final Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void mechanizmFight(){
        randomizeEnemy.randomChoiceEnemy(random.nextInt(3)+1);

        String name = giveInformacion.getName();
        int life = giveInformacion.getLife();
        int maxLife = giveInformacion.getMaxLife();
        int defend= giveInformacion.getDefend();
        int damage= giveInformacion.getDamage();



        boolean warIsBrutal = true;
        while (warIsBrutal){

            System.out.println("\n Wynik walki z "+ name +
                    "\n Bohater - HP: "+hero.getLife()+"/"+hero.getMaxLife()+" Deff: "+hero.getDefend()+" Atk: "+hero.getDamage()+
                    "\n Przeciwnik - HP: "+life+"/"+maxLife+" Deff: "+defend+" Atk: "+damage +
                    "\n Co zamierzasz zrobić?"+
                    "\n 1. Zaatakować? Robi się!!!"+
                    "\n 2. Odpocząć? A w sumie czemu nie, odrobina życia zawsze się przyda :D"+
                    "\n Inna cyfra -  Run Forest! RUUUUN!!!\n");

            int dmgHero = hero.getDamage() - defend;

            if (dmgHero < 0) {
                dmgHero = 0;
            } else {
                dmgHero = hero.getDamage() - defend;
            }

            int dmgEnemy = damage - hero.getDefend();

            if (dmgEnemy < 0) {
                dmgEnemy = 0;
            } else {
                dmgEnemy = damage - hero.getDefend();
            }

            int checkChoise = scanner.nextInt();
            switch (checkChoise){
                case 1:
                    life-=hero.getDamage();
                    if (life > 0) {
                        if (dmgHero==0){
                            System.out.println("\n Podnieś swój dmg!!!");
                        } else {
                            System.out.println("\n Zadałeś "+dmgHero+" pkt obrażeń.");
                        }
                        hero.changeLife(-dmgEnemy);

                        if (hero.getLife() > 0) {
                            System.out.println("\n Otrzymałeś " + dmgEnemy + " pkt obrażeń.");
                        } else {
                            System.out.println("\n Przeciwnik zadał " + damage + " pkt obrażeń."+
                                    "\n Otrzymałeś śmiertelny cios. Kończymy grać!!!");
                            warIsBrutal=false;
                            break;
                        }
                    } else {
                        System.out.println("\n Gratulacje!!! Zadałeś ostateczny cios!!! Zdobywasz 50 expa oraz 1000 golda");

                        hero.addExp(50);
                        hero.czangeMoney(1000);
                        hero.stats();
                        life=maxLife;
                        randomizeEnemy.randomChoiceEnemy(random.nextInt(3)+1);
                        name = giveInformacion.getName();
                        life = giveInformacion.getLife();
                        maxLife = giveInformacion.getMaxLife();
                        defend= giveInformacion.getDefend();
                        damage= giveInformacion.getDamage();
                    }
                    break;

                case 2:
                    hero.changeLife(20);
                    System.out.println("\nOdpoczynek dał Ci 20hp. Masz teraz "+
                            hero.getLife()+"/"+ hero.getMaxLife()+" hp."+
                            "\nOtrzymałeś " + damage + " pkt obrażeń.");
                    hero.changeLife(-damage);
                    if (hero.getLife() <= 0) {
                        System.out.println("\nOtrzymałeś śmiertelny cios. Kończymy grać!!!\n");
                        warIsBrutal=false;
                        break;
                    } else {
                        System.out.println("\nZostało Ci "+ hero.getLife()+"/"+ hero.getMaxLife()+" hp.\n");
                    }
                    break;
                default:
                    warIsBrutal=false;
                    break;
            }
        }





    }


}

package jobs;

import game.hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JobsRandomizer {
private final List<JobsManager> list;
private Random random = new Random();
private Hero hero = Hero.getInstance();

    public JobsRandomizer(){
        list=new ArrayList<>();
        list.add(new JobsManager("Ochroniarz pastwiska Zielone Krówki",2000,
                " opis pracy", "Zostałeś pobity i tracisz 20hp"));
        list.add(new JobsManager("Ochroniarz na weselu",2000,
                "Co mi tu mamy", "Życie jest Ci nie miłe i rzuciłeś sie z mostu"));
        list.add(new JobsManager("Ochroniarz transportu",2000,
                "Opisz pracy v2", "A co to to to jest ;D"));
        list.add(new JobsManager("Strażnik miejski",2000,
                "Opisz pracy v3", "v2 A co to to to jest ;D"));
    }

    public void randomChoiceJob(){
        StringBuilder sb = new StringBuilder();
        int losowanie = random.nextInt(list.size());
        sb.append("\n Znalazłeś pracę jako: "+list.get(losowanie).getNameJobs());
        int czyZarobił = random.nextInt(10);
        if (czyZarobił>2){
            list.get(losowanie).getDescriptionWin();
            sb.append("\n Zarobiłeś "+list.get(losowanie).getEarnings());
            hero.czangeMoney(list.get(losowanie).getEarnings());
            sb.append("\n Masz teraz "+hero.getMoney()+" golda.");
        } else {
            list.get(losowanie).getDescriptionLose();
            hero.changeLife(-20);
            if (hero.getLife()<=0){
                sb.append("\n Umarło Ci się...");
            } else {
                sb.append("\n Straciłeś 20 hp.... Zostało Ci "+hero.getLife()+" życia.");
            }
        }
        System.out.println(sb);
    }
}

package jobs;

import game.HeroSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JobsRandomizer {
private List<JobsManager> list;
private StringBuilder sb = new StringBuilder();
private Random random = new Random();
private HeroSingleton heroSingleton = HeroSingleton.getInstance();

    public JobsRandomizer(){
        list=new ArrayList<>();
        list.add(new JobsManager("Ochroniarz pastwiska Zielone Krówki",2000," opis pracy", "Zostałeś pobity i tracisz 20hp"));
        list.add(new JobsManager("Ochroniarz na weselu",2111,"Co mi tu mamy", "Życie jest Ci nie miłe i rzuciłeś sie z mostu"));
        list.add(new JobsManager("Ochroniarz transportu",3200,"Opisz pracy v2", "A co to to to jest ;D"));
        list.add(new JobsManager("Strażnik miejski",3200,"Opisz pracy v3", "v2 A co to to to jest ;D"));
    }

    public void sprawdzienie(){
        sb.append("Wielkość listy to: "+list.size());
        int losowanie = random.nextInt(list.size());
        sb.append("\n Znalazłeś pracę jako: "+list.get(losowanie).getNameJobs());
        int czyZarobił = random.nextInt(10);
        if (czyZarobił>8){
            list.get(losowanie).getDescriptionWin();
            sb.append("Zarobiłeś "+list.get(losowanie).getEarnings());
            heroSingleton.czangeMoney(list.get(losowanie).getEarnings());
        } else {
            list.get(losowanie).getDescriptionLose();
            heroSingleton.czangeLife(-20);
            if (heroSingleton.getLife()<=0){
                sb.append("Wykazano śmierć");
            } else {
                sb.append("Stracono 20hp");
            }
        }
        System.out.println(sb);
    }
}

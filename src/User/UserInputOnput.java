package User;

import game.Hero;

public class UserInputOnput {
    private final Hero hero = Hero.getInstance();

    public void choiseOnput(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nCo teraz zamierzasz zrobić");
        sb.append("\n 1. Iść zdobyć Dungeuron!!!");
        sb.append("\n 2. Idziesz szukać pracy."); //zrandomizuj
        sb.append("\n 3. Idziesz do szkoły poprawić swoje parametry.");//dodaj petle 5/10/maks itp itd)
        sb.append("\n 4. A może by tak się najeść? To jest to!!! (idziesz do karczmy");
        sb.append("\n 5. Sprawdz swoje statystyki oraz ekwipunek");
        sb.append("\n Inna cyfra wyłącza grę\n");
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nTwój wybór to...:");
        System.out.println(sb);
    }

    public void run(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n *___Wstęp___* \n");
        sb.append("Jakie jest Twoje miano?");
        System.out.println(sb);
    }
}

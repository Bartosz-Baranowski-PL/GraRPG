package user;

import game.Hero;

public class UserInputOnput {
    private final Hero hero = Hero.getInstance();

    public void choiseOnput(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nCo teraz zamierzasz zrobić?");
        sb.append("\n 1. Zdobyć Dungeuron!");
        sb.append("\n 2. Szukać pracy.");
        sb.append("\n 3. Wyprawa do szkoły aby poprawić swoje parametry.");
        sb.append("\n 4. A może by się tak po prostu najeść? To jest to - podróż do do karczmy!");
        sb.append("\n 5. Sprawdzić swoje statystyki oraz ekwipunek.");
        sb.append("\n X. Inny wybór wyłączy gre\n");
        sb.append("\n -----------------------MENU----------------------- \n");
        sb.append("\nTwój wybór to: ");
        System.out.println(sb);
    }

    public void run(){
        StringBuilder sb = new StringBuilder("\n *___Wstęp___* \n");
        sb.append("Jakie jest Twoje miano?");
        System.out.println(sb);
    }
}

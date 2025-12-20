package user;

import static java.lang.System.out;

public class UserInputOutput {

    public void choiceOutput() {
        //  Tutaj jest tylko jedno wywołanie `String.out.println()` więc nie ma sensu używać StringBuilder
        out.println(
                "\n -----------------------MENU----------------------- \n" +
                "\nCo teraz zamierzasz zrobić?" +
                "\n 1. Zdobyć Dungeuron!" +
                "\n 2. Szukać pracy." +
                "\n 3. Wyprawa do szkoły aby poprawić swoje parametry." +
                "\n 4. A może by się tak po prostu najeść? To jest to - podróż do karczmy!" +
                "\n 5. Sprawdzić swoje statystyki oraz ekwipunek." +
                "\n X. Inny wybór wyłączy grę\n" +
                "\n -----------------------MENU----------------------- \n" +
                "\nTwój wybór to: "
        );
    }

    public void run() {
        out.println(
                "\n *___Wstęp___* \n" +
                "Jakie jest Twoje miano?"
        );
    }
}

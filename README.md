GraRPG
Prosty projekt gry RPG napisanej w Java, rozwijany w celach edukacyjnych.
Repozytorium zawiera podstawowe klasy i mechanizmy, które mogą posłużyć jako fundament do dalszej rozbudowy gry.

Spis treści
[Opis projektu](#opis-projektu)
[Wymagania](#wymagania)
[Instalacja i uruchomienie](#instalacja-i-uruchomienie)
[Struktura projektu](#struktura-projektu)
[Przykładowe funkcje](#przykładowe-funkcje)
[Plany rozwoju](#plany-rozwoju)
[Autor](#autor)

Opis projektu
GraRPG to tekstowa gra RPG, w której gracz może:
tworzyć postać,
eksplorować świat,
walczyć z przeciwnikami,
rozwijać swoje statystyki.

Projekt powstał jako ćwiczenie programistyczne i przykład zastosowania obiektowego podejścia w Javie.

Wymagania
Java 17 lub nowsza
Dowolne IDE (np. IntelliJ IDEA, Eclipse, VS Code)
System operacyjny: Linux / Windows / macOS


Instalacja i uruchomienie
Sklonuj repozytorium:

   git clone https://github.com/Bartosz-Baranowski-PL/GraRPG.git


Przejdź do katalogu projektu:

   cd GraRPG


Uruchom aplikację:

   javac src/Main.java
   java Main


Struktura projektu
GraRPG/
├── src/                # Kod źródłowy gry
│   ├── Main.java       # Punkt startowy aplikacji
│   ├── ...             # Klasy gry (postacie, walka, itp.)
├── .idea/              # Pliki konfiguracyjne IDE
├── Grarpg.iml          # Plik projektu IntelliJ
└── .gitignore          # Ignorowane pliki

Funkcje jakie posiada gra:
- Tworzenie postaci z imieniem i statystykami
- Walka turowa z przeciwnikami
- System punktów życia i doświadczenia
- Rozwój bohatera poprzez zdobywanie poziomów i rozwijanie statystyk
- Zrandomizowany system prac


Plany rozwoju
Dodanie ekwipunku i przedmiotów
Poprawa metod
zapis i odczyt
dodanie osiągnięć
dodanie umiejętności


[Autor]
Projekt stworzony przez: Bartosz Baranowski

Dziękuję za wsparcie w nauce i rozwój projektu! 😄 Zwłaszcza:
- Dawid Bielecki https://github.com/dawciobiel

# GraRPG
To prosty projekt gry typu role-playing game napisanej w języku Java w celach edukacyjnych. Repozytorium zawiera fundament do dalszej rozbudowy gry.

## Spis treści
- [Opis projektu](#opis-projektu)
- [Wymagania](#wymagania)
- [Uruchomienie](#instalacja-i-uruchomienie)
- [Struktura projektu](#struktura-projektu)
- [Funkcje jakie posiada gra](#przykładowe-funkcje)
- [Plany rozwoju](#plany-rozwoju)
- [Autor](#autor)
- [Podziękowania](#podziękowania).

## Opis projektu
Gra tekstowa, gdzie "gracz" ma za zadanie sprawdzic logikę kodu gry i przy okazji dobrze będzie się bawić.

## Wymagania developerskie
- Java 17+
- Dowolne IDE (np. IntelliJ IDEA)
- System operacyjny: Linux / Windows / macOS


## Uruchomienie
1. Sklonuj repozytorium:

   `git clone https://github.com/Bartosz-Baranowski-PL/GraRPG.git`


2. Przejdź do katalogu projektu

   `cd GraRPG`


3. Uruchom aplikację

   ```shell
   javac src/Main.java
   java Main
   ```


## Struktura projektu

```log
GraRPG/
├── src/                # Kod źródłowy gry
│   ├── Main.java       # Punkt startowy aplikacji
│   ├── ...             # Klasy gry (postacie, walka, itp.)
├── .idea/              # Pliki konfiguracyjne IDE
├── Grarpg.iml          # Plik projektu IntelliJ
└── .gitignore          # Ignorowane pliki
```

## Funkcje gry
- Tworzenie postaci z imieniem i statystykami
- Walka turowa z przeciwnikami
- System punktów życia i doświadczenia
- Rozwój bohatera poprzez zdobywanie poziomów i rozwijanie statystyk
- Zrandomizowany system prac


## Plany rozwoju
- Refaktoryzacja istniejącego kodu
- Dodanie funkcji zapisu i odczytu danych

## Autor
- [Bartosz Baranowski](<https://github.com/Bartosz-Baranowski-PL>)

## Podziękowania
- [Dawid Bielecki](<https://github.com/dawciobiel>)

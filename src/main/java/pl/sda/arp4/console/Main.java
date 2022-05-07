package pl.sda.arp4.console;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // wyjście programu
        System.out.println("Rozpoczynam działanie");

        // wejście programu
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię");

        // wczytuje imie od użytkownika (jakikolwiek tekst - 1 słowo/token)
        String zmiennaImie = scanner.next();
        System.out.println("Witaj " + zmiennaImie + "!");
    }

}

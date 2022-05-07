package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaWhileDoQuit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inicjalna wartość, pierwsze wpisanie
        System.out.println("Wpisz tekst:");
        String tekst = scanner.next();

        while (!tekst.equals("quit")){
            System.out.println("Hello world!");

            // ponowne wczytanie tekstu:
            System.out.println("Wpisz tekst:");
            tekst = scanner.next();
        }
    }
    }


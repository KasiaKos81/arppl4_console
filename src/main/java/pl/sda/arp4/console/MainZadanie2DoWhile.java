package pl.sda.arp4.console;

import java.util.Scanner;

// Napisz program, który wypisuje "Hello World" dopóki użytkownik podaje liczby większe od 0.

public class MainZadanie2DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba;

        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();

            // break zatrzymuje w tym przypadku działanie programu
            if(liczba <= 0){
                break;
            }

            System.out.println("Hello World");

        } while (liczba > 0);

}}

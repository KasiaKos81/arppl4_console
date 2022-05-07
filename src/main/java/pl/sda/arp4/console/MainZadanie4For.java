package pl.sda.arp4.console;

import java.util.Scanner;

// Napisać program w którym użytkownik podaje na początku dwie liczby:
// początekZakresu oraz koniecZakresu. Upewnij się że początekZakresu < koniecZakresu a następnie
//pobierz od użytkownika kolejną liczbę - dzielnik. Po pobraniu dzielnika wypisz wszystkie liczby
// od początekZakresu do koniecZakresu które są podzielne przez dzielnik.

public class MainZadanie4For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1 początkową");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj liczbę 2 końcową");
        int liczba2 = scanner.nextInt();

        if(liczba1 > liczba2){
            System.out.println("pętla nie wykona się ponieważ koniec zakresu jest mniejszy niż początek zakresu");

        }

        System.out.println("podaj dzielnik");
        int dzielnik = scanner.nextInt();

        for (int i = liczba1; i < liczba2+1; i++) {
            if(i % dzielnik == 0) {
                System.out.println(i);
            }

        }
    }

}

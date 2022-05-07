package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1 początkową");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj liczbę 2 końcową");
        int liczba2 = scanner.nextInt();

        if (liczba1 > liczba2) {
            System.out.println("pętla nie wykona się ponieważ koniec zakresu jest mniejszy niż początek zakresu");
        }

        System.out.println("podaj dzielnik");
        int dzielnik = scanner.nextInt();

        int i = liczba1;
        do {
            if (i % dzielnik == 0) {
                System.out.println(i);
            }
            i++;
        }   while (i < liczba2 + 1);
    }
}

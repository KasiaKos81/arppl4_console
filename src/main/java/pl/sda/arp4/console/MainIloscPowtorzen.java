package pl.sda.arp4.console;

import java.util.Scanner;

public class MainIloscPowtorzen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość powtórzeń");

        int iloscPowtorzen = scanner.nextInt();

        for (int i = 0; i < iloscPowtorzen; i++) {
            System.out.println("Hello World " + (i+1));

        }


    }
}

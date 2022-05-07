package pl.sda.arp4.console;

import java.util.Scanner;

public class MainDekady {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wiek");

        int zmiennaWiek = scanner.nextInt();
        int wiekDekady = zmiennaWiek/10;

        System.out.println("Zyjesz już " + wiekDekady + " dekad!");


    }
}

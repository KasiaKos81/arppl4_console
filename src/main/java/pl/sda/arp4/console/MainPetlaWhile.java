package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaWhile {

    public static void main(String[] args) {


        // sa dwie pętle while
        // do while - coś musi sie chociaż raz wykonać
        // while do

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        // pętla dekrementująca
        // do wykonuj

        do {
            System.out.println(liczba + " Hello World");
            //dekrementacja
            liczba--;

            // while dopóki
        } while(liczba > 0);

        // pętla inkrementujaca

        System.out.println("Podaj liczbę:");
        int liczba1 = scanner.nextInt();

        // Pętla inkrementująca (taka jak for)
        // do (wykonuj)
        int i =0;
        System.out.println("Inkrementacja: ");
        do{
            System.out.println((i) +" Hello World!");

            // inkrementacja
            i++;

            // while(dopóki)
        }while (i < liczba1);

        }}





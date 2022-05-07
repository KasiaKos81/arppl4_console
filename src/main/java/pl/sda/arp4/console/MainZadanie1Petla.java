package pl.sda.arp4.console;

public class MainZadanie1Petla {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.println(i);

        }
        for (int i = 1000; i < 1021; i++) {
            System.out.print(i+" ");

        }
        for (int i = -30; i < 1001; i++) {
            if (i % 5 == 0) { // jesli reszta z dzielenia jest zero wypisz na ekran
                System.out.println(i);
            }
        }

            for (int j = 1; j <= 100 ; j++) {
                if(j % 3 == 0) {
                    System.out.println(j);
                }

            }

        System.out.println("liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach");
        for (int i = 30; i < 301; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
            }

        }

        }}






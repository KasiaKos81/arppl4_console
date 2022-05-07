package pl.sda.arp4.console;

import java.util.Scanner;

public class MainEnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj stan cywilny WOLNY/ZAJETY");

        String stanCywilny = scanner.next();

        // Deklaracja przed if'em
        StanCywilny zmiennaStanCywilny = StanCywilny.NIEZNANY;

      if(stanCywilny.equals("ZAJETY")){
          zmiennaStanCywilny = StanCywilny.ZAJETY;

        } else if (stanCywilny.equals("WOLNY")){
          zmiennaStanCywilny = StanCywilny.WOLNY;

        }
        // można skorzystać ze zmiennej poza if'em bo jest zadeklarowana wcześniej
         System.out.println(zmiennaStanCywilny);

        switch (zmiennaStanCywilny){
            case WOLNY:
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJETY:
                System.out.println("Ten typ jest zajęty");
                break;
            default:
                System.out.println("Ano wolny, ani zajęty, brak info");
        }
    }
}

package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hej. skriv en månad");


        String input = sc.nextLine();
        switch (input.toLowerCase()) {  // input.toLowerCase förvandlar alla till små bokstäver

            // ska man ha in int eller double så ska man inte ha "täcken" för skriv bara siffran rätt ut
            case "januari", "mars", "juli", "augusti", "oktober", "december" -> System.out.println("31");
            case "april", "juni", "september", "november" -> System.out.println("30");
            case "februari" -> System.out.println("28");

            default -> System.out.println("Fel input");
        }


    }
}

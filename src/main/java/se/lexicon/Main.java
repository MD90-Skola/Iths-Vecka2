package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "michel";
        int pinCode = 1337;
        int input;

        System.out.println("hej " + name + " skriv in din pinkod");
        input = sc.nextInt();






/*        do{
            System.out.println("felkod");
            input = sc.nextInt();
        }while (input != pinCode);*/


        while (input != pinCode) {
            System.out.println("fel kod");
            input = sc.nextInt();
        }
        System.out.println("rätt kod");


/*        if (input == pinCode) {
            System.out.println("du har rätt kod");
        } else {
            System.out.println("du har fel kod");

        }*/


    }
}

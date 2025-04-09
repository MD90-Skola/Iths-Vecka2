

package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // skriva ut alla gämna tal 1-10




        /*
        (int i =1; Första gången vi kör våran forloop då skapas I då får det värdet 1
        i < 10   ; eftersom 1 är minde än 10 så komme den köra forloopen
        i = i +1 ; sen plussar på så det blir 2

          for (int i =1; i < 10;i = i +1 ){
            System.out.println(i);
        }

         */


         //   modulo operator
        //   % delar det värdet som står framför med det värdet som står bakom
        //     och sen kollar den vad som blir över

        for (int i = 1; i <= 10; i = i + 1) {
            if (i% 2 == 0){   // kollar om tal är jämt
                System.out.println(i);


            }
        }


        //
       //  System.out.println(8 % 3);














/*
        int nr = 50;
        String name = "Frodo";


        // 2st && = både vilkår 10 eller 100 måste stämma skriver jag 101 så kommer den inte skrva ut tex:
        // går att blanda int med string

        if (nr > 10 && name.equalsIgnoreCase("Frodo")) {
            System.out.println("nr är större än 10 och mindre än 100");
        }else if (nr>10){
            System.out.println("nr är större än tio.");
        }else if (nr<100){
            System.out.println("nr är mindre än 100");
        }
*/







/*

                                        Denna kod kollar vilkår

        // 2st && = både vilkår 10 eller 100 måste stämma skriver jag 101 så kommer den inte skrva ut tex:
        if (nr > 10 && nr < 100) {
            System.out.println("nr är större än 10 och mindre än 100");
        }
*/






/*

                                    // nu kommer den kolla om nummer är större än 10
                                    //              ELLER
                                    // om nummer är mindre än 100
                                    //                OCH OM
                                    //       något av dom här två stämmer

        // 2st && = både vilkår 10 eller 100 måste stämma skriver jag 101 så kommer den inte skrva ut tex:
        if (nr > 10 || nr < 100) {
            System.out.println("nr är större än 10 och mindre än 100");
        }
*/


    }
}

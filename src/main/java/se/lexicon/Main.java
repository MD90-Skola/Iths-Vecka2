package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int sum = 0;

        for(int i = 0; i <=10; i++){
            sum=sum +i;

            System.out.println("sum är"+sum);
            System.out.println("-----");
            System.out.println("I är"+i);
        }

        System.out.println(sum);







/*
        for(int i = 1; i <= 10; i = i + 1){
            //kommer köras endast om villkoret stämmer
            System.out.println(i);
        }
*/



    }
}

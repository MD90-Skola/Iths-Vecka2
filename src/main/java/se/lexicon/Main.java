package se.lexicon;
import java.util.Scanner;
// https://www.youtube.com/watch?v=mMK6l5-nbFM Faceit


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in en in siffra 0-100");
        int input = sc.nextInt();


        // om i är detlbart med 3, skriv ut Fizzz
        // om i är delbart med 5, skriv ut Buzz
        // om i är delbart med både 3 och 5, skriv ut FizzBuzz

        for (int i = 1; i <= input; i = i + 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }
    }
}

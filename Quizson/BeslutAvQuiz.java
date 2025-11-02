package Quizson;

import java.util.Scanner;

public class BeslutAvQuiz {

    public static int beslut(Scanner scanner){

            System.out.println("\nDags att välja ett av alternativen: ");
            System.out.println("1. Blandade kategorier");
            System.out.println("2. Specifika kategorier");

            int val = ValideraInput.läsHeltalIInterval(scanner, 1, 2, "Skriv in ditt val (1 eller 2): ");

            while(val != 1 && val != 2){
                System.out.println("Ogiltigt val! Välj igen");
                val = scanner.nextInt();
            }
            return val;
    }
}
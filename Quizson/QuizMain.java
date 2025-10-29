package Quizson;
import java.util.Scanner;

public class QuizMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("!!! Välkommen till Quizsons frågesport !!!");
        System.out.println("Spelreglerna är enkla: ");
        System.out.println("Du väljer om du vill ha 1. Blandade eller 2. Specefika kategorier på frågorna.");
        System.out.println("Frågorna är från början värda ett visst antal poäng, men de minskar i värde ju längre tiden går.");
        System.out.println("När tiden tar slut byter spelet automatiskt till nästa fråga.");

        int val = BeslutAvQuiz.beslut();
       

        if (val == 1){
            System.out.println("Du valde blandade kategorier");
            System.out.println();
            BlandadeFragorMetod.startQuiz();

            } else { 
                
                System.out.println("\nDu valde specifika kategorier");
                System.out.println("**********************************");
                System.out.println("Välj mellan de fyra olika teman: ");
                System.out.println("1. Allmänbildning");
                System.out.println("2. Film & serier");
                System.out.println("3. Vetenskap");
                System.out.println("4. Sport");
                System.out.print("Skriv in 1-4: ");

                int valet = scanner.nextInt();

                switch (valet) {
                    case 1 -> FragorSpecefika.allmanbildningsQuiz();
                    case 2 -> FragorSpecefika.seriefilmQuiz();
                    case 3 -> FragorSpecefika.vetenskapQuiz();
                    case 4 -> FragorSpecefika.sportQuiz();
                    
                }
                scanner.close();
            }
        
            
            
        }
    }


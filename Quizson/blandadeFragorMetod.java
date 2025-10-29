package Quizson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlandadeFragorMetod {
    public static void startQuiz(){
        ArrayList<Fraga> allaFragor = new ArrayList<>();

        allaFragor.addAll(FragorBlandade.allmanbildningsQuiz());
        allaFragor.addAll(FragorBlandade.sportQuiz());
        allaFragor.addAll(FragorBlandade.vetenskapQuiz());
        allaFragor.addAll(FragorBlandade.seriefilmQuiz());

        Collections.shuffle(allaFragor);

        Scanner scanner = new Scanner(System.in);
        int antalRatt = 0;
        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            Fraga f = allaFragor.get(i);
            startTidFraga = System.currentTimeMillis();
            System.out.println("Fråga " + (i + 1) + ": ");
            f.visaFraga();

            System.out.print("Ditt svar (1-4): ");
            int svar = scanner.nextInt();

            long slutTidFraga = System.currentTimeMillis();
            svarsTid = slutTidFraga - startTidFraga;

            if (svarsTid > 60000) {
                System.out.println("Du tog för lång tid! max svarstid är 60 sekunder.");
            } else if (svar == f.rattSvar) {
                System.out.println("Rätt svar!");
                System.out.println();
                antalRatt++;
                totalTidFragaMillis += svarsTid;
            } else {
                System.out.println("Fel svar! Rätt svar var: " + f.alternativ[f.rattSvar - 1]);
                System.out.println();
            }
        }
        
        long slutTid = System.currentTimeMillis();

        System.out.println("Du fick " + antalRatt + " av 10 rätt!");
        TidOchPoang.tidPoang(slutTid, startTid, totalTidFragaMillis, antalRatt);
        
       // scanner.close();
    }
}

package Quizson;
import java.util.Scanner;

public class QuizMetoder{

    public static void fragorOchSvar(Scanner scanner,String [] fragor, String [][] svarsAlternativ, int []rattSvar){
        int antalRatt = 0;
        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();
        for (int i = 0; i < fragor.length; i++) {

            startTidFraga = System.currentTimeMillis();
            System.out.println("Fråga " + (i + 1) + ": " + fragor[i]);

            for (String alt : svarsAlternativ[i]) {
                System.out.println(alt);
            }

            int svar = ValideraInput.läsHeltalIInterval(scanner, 1, 4, "Ditt svar (1-4): ");


            long slutTidFraga = System.currentTimeMillis();
            svarsTid = slutTidFraga - startTidFraga;

            if (svarsTid > 60000) {
                System.out.println("Du tog för lång tid! Max svarstid är 60 sekunder.");
            } else if (svar == rattSvar[i]) {
                System.out.println("Rätt svar!");
                System.out.println();
                antalRatt++;
                totalTidFragaMillis += svarsTid;
            } else {
                System.out.println("Fel svar! Rätt svar var: " + svarsAlternativ[i][rattSvar[i] - 1]);
                System.out.println();
            } 
        }
        
        long slutTid = System.currentTimeMillis();

        System.out.println("Du fick " + antalRatt + " av " + fragor.length + " rätt!");
        TidOchPoang.tidPoang(slutTid, startTid, totalTidFragaMillis, antalRatt);
    }
}
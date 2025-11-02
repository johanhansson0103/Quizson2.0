package Quizson;
import java.util.Scanner;
import java.util.ArrayList;

public class QuizMetoder{

    public static void fragorOchSvar(Scanner scanner, ArrayList<Fraga> fragaLista){
        int antalRatt = 0;
        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();
        for (int i = 0; i < fragaLista.size(); i++) {
            Fraga f = fragaLista.get(i);
            startTidFraga = System.currentTimeMillis();
            
            System.out.println("Fråga " + (i + 1) + ": ");
            f.visaFraga();

            int svar = ValideraInput.läsHeltalIInterval(scanner, 1, 4, "Ditt svar (1-4): ");

            long slutTidFraga = System.currentTimeMillis();
            svarsTid = slutTidFraga - startTidFraga;

            if (svarsTid > 30000) {
                System.out.println("Du tog för lång tid! Max svarstid är 30 sekunder.\n");
            } else if (svar == f.rattSvar) {
                System.out.println("Rätt svar!\n");
                antalRatt++;
                totalTidFragaMillis += svarsTid;
            } else {
                System.out.println("Fel svar! Rätt svar var: " + f.alternativ[f.rattSvar - 1]);
                System.out.println();
            } 
        }
        
        long slutTid = System.currentTimeMillis();

        System.out.println("Du fick " + antalRatt + " av " + fragaLista.size() + " rätt!");
        TidOchPoang.tidPoang(slutTid, startTid, totalTidFragaMillis, antalRatt);
    }
}
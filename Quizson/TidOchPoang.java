package Quizson;

public class TidOchPoang {
    public static void tidPoang (long slutTid, long startTid, long totalTidFragaMillis, int antalRatt) {

        long totalTidMillis = slutTid - startTid;
        int totalTidSekunder = (int) (totalTidMillis / 1000);
        int totalTidMinuter = totalTidSekunder / 60;
        int totalTidSekunderKvar = totalTidSekunder % 60;

        int totalTidFragaSekunder = (int) (totalTidFragaMillis / 1000);
        int maxTidPerFraga = 30;
        int totalMaxSekunder = antalRatt * maxTidPerFraga;
        int totalPoang = totalMaxSekunder - totalTidFragaSekunder;

        System.out.println("Din totala tid blev " + totalTidMinuter + " min och " + totalTidSekunderKvar + " sekunder.");
        System.out.println("Du svarade de " + antalRatt + " frågorna på sammanlagt " + totalTidFragaSekunder + " sekunder vilket leder till " + totalPoang + " poäng!");
    }
}

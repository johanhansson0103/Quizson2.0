package Quizson;

import java.util.ArrayList;
import java.util.Collections;

    public class Fraga {
    String fraga;
    String[] alternativ;
    int rattSvar;

        public Fraga(String fraga, String[] alternativ, int rattSvar){
            this.fraga = fraga;
            this.alternativ = alternativ;
            this.rattSvar = rattSvar;

            blandaAlternativ();
        }

        private void blandaAlternativ(){
            ArrayList<String> lista = new ArrayList<>();
            Collections.addAll(lista, alternativ);

            String korrektAlternativ = alternativ[rattSvar - 1];

            Collections.shuffle(lista);

            alternativ = lista.toArray(new String[0]);

            for (int i = 0; i < alternativ.length; i++) {
                if (alternativ[i].equals(korrektAlternativ)) {
                    rattSvar = i + 1;
                    break;
                }
            }
        }

    public void visaFraga(){
        System.out.println(fraga);
        for (int i = 0; i < alternativ.length; i++) {
            System.out.println((i + 1) + ". " + alternativ[i]);
        }
    }
}

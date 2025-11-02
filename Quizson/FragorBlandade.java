package Quizson;
import java.util.ArrayList;

public class FragorBlandade {
    
    public static ArrayList<Fraga> allmanbildningsQuiz(){
        ArrayList<Fraga> list = new ArrayList<>();
        String [] fragor = {
            "Vilken kontinent är störst till ytan?",
            "Vilken krydda ingår INTE i klassiska pepparkakor?",
            "Vilket land har flest öar i världen?",
            "Vilken frukt används för att göra traditionell cider?",
            "Hur mycket är ett dussin?",
            "Vem målade Mona Lisa?",
            "Vad är öl gjort på?",
            "Hur många magar har en ko?",
            "Vilken svensk artist vann Eurovision 2012?",
            "Vilket år landade människan på månen?"
        };

        String [][] svarsAlternativ = {
            {"Afrika", "Nordamerika", "Asien", "Sydamerika"},
            {"Ingefära", "Kryddnejlika", "Peppar", "Kanel"},
            {"Kanada", "Finland", "Sverige", "Indonesien"},
            {"Äpple", "Päron", "Druva", "Apelsin"},
            {"24", "12", "6", "30"},
            {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Claude Monet"},
            {"Korn", "Potatis", "Råg", "Havre"},
            {"En mage", "Två magar", "Tre magar", "Fyra magar"},
            {"Frans", "Måns Zelmerlöw", "Charlotte Perelli", "Loreen"},
            {"1969", "1972", "1974", "1967"}
        };

        int [] rattSvar = {3, 3, 3, 1, 2, 1, 1, 4, 4, 1};

        for(int i = 0; i< fragor.length; i++){
            list.add(new Fraga(fragor[i], svarsAlternativ[i], rattSvar[i]));
        }
        
        return list;
    }

    public static ArrayList<Fraga> sportQuiz(){
        ArrayList<Fraga> list = new ArrayList<>();
        String [] fragor = {
            "Sveriges förbundskapten Jon Dahl Tommasson blev avskedad den 14 oktober efter en rad svaga resultat. Vem blev hans ersättare?",
            "Vem av de nuvarande förarna i F1 har vunnit flest VM titlar?",
            "Den svenska pingisspelaren Truls Möregårdh tog sig till final i OS 2024. Vilket land slog ut honom?",
            "Höjdhopparen Armand Duplantis satte ett nytt världsrekord i VM 2025. Hur högt hoppa han?",
            "Tennisturneringen US Open 2025 vann Carlos Alcaraz. Vilket land kommer han ifrån?",
            "Vilken svensk ryttare tog OS-Silver i hoppning både 2016 och 2021?",
            "Vilket svenskt damlag tog OS-Guld i curling i Pyeongchang 2018?",
            "Vilken fiskart är vanligast i svenska insjöar?",
            "Vad heter det största svenska LAN-evenmanget där tusentals spelare samlas för att spela och tävla?",
            "Vilken svensk hockeyspelare har gjort flest poäng i NHL genom tiderna?"
        };

        String [][] svarsAlternativ = { 
            {"Graham Potter", "Janne Andersson", "Alex Ferguson", "Lasse Lagerbäck"},
            {"Lewis Hamilton", "Max Verstappen", "Fernando Alonso", "George Russel"},
            {"Norge", "Brasilien", "Frankrike", "Kina"},
            {"6,40 m", "6,30 m", "6,17 m", "6,27 m"},
            {"Portugal", "Mexiko", "Spanien", "Argentina"},
            {"Peder Fredricson", "Rolf-Göran Bengtsson", "Henrik Von Eckermann", "Malin Baryard-Johnsson"},
            {"Lag Wrang", "Lag Edin", "Lag Hasselborg", "Lag Norberg"},
            {"Gös", "Gädda", "Mört", "Abborre"},
            {"GameX", "Dreamhack", "Assembly", "GamerCon"},
            {"Henrik Zetterbergn", "Peter Forsberg", "Mats Sundi", "Daniel Alfredsson"}
        };

        int [] rattSvar = {1, 1, 4, 2, 3, 1, 3, 4, 2, 3}; 

        for(int i = 0; i< fragor.length; i++){
            list.add(new Fraga(fragor[i], svarsAlternativ[i], rattSvar[i]));
        }
        
        return list;
    }

    public static ArrayList<Fraga> vetenskapQuiz(){
        ArrayList<Fraga> list = new ArrayList<>();
        String [] fragor = {
            "Hur många hjärtan har en spindel?",
            "Vilken av följande metoder är inte ett sätt för växter att få näring?",
            "Vilket är det enda organet som kan regenerera sig själv?",
            "Vad kallas mitten av en atom?",
            "Vem är känd som den moderna fysikens fader?",
            "Var finns det minsta benet i människokroppen?",
            "Av vilket grundämne består en diamant?",
            "Vad kallas mängden materia i ett föremål?",
            "Vilket är det största flygande djuret?",
            "Vilken är den närmaste stjärnan till jorden efter solen?",
        };

        String [][] svarsAlternativ = {
            {"Som människor", "Cirkulationssystemet kallas dubbelt system. Varje hjärta ansvarar för fyra ben.", "Som bläckfisken som använder sina olika hjärtan för att röra sina olika ben.", "De saknar cirkulationssystem. Som andra djur, till exempel maneter."},
            {"Fotosyntes", "Köttätande", "Sporer", "Parasitisk"},
            {"Lungor", "Hud", "Hjärta", "Lever"},
            {"Proton", "Neutron", "Hackathon", "Elektron"},
            {"Albert Einstein", "Isaac Newton", "Nikola Tesla", "Galileo Galilei"},
            {"Näsa", "Öra", "Haka", "Armbåge"},
            {"Syre", "Kisel", "Kol", "Kväve"},
            {"Densitet", "Volym", "Vikt", "Massa"},
            {"Vandringsalbatross", "Australisk fladdermus", "Kejsarörn", "Skatan på min balkong"},
            {"Proxima Centauri", "Alfa Centauri 1", "Optimus Prime", "Alfa Centauri 2"}
        };

        int [] rattSvar = {1, 3, 4, 1, 1, 2, 3, 4, 1, 1};

        for(int i = 0; i< fragor.length; i++){
            list.add(new Fraga(fragor[i], svarsAlternativ[i], rattSvar[i]));
        }
        
        return list;
    }

    public static ArrayList<Fraga> seriefilmQuiz(){
        ArrayList<Fraga> list = new ArrayList<>();
        String[] fragor = {
            "Vem regisserade kultfilmen Pulp Fiction från 1994, en film känd för sin icke-linjära berättarstruktur?",
            "Jon Snow är en nyckelfigur i Game of Thrones. Vilket hus betraktade han sig själv som en del av under större delen av serien?",
            "Vem spelar huvudrollen Katniss Everdeen i filmserien The Hunger Games?",
            "Vilken TV-serie, baserad på en serietidning, handlar om en grupp överlevande efter en zombieapokalyps?",
            "Vilken är den första Disney-filmen där en prinsessa inte behöver räddas av en man?",
            "Vilken skådespelare spelar huvudrollen som den excentriske detektiven Sherlock Holmes i BBC-serien Sherlock (2010–2017)?",
            "I Matrix-filmerna, vilken färg har pillret som Neo tar för att upptäcka sanningen om Matrix?",
            "Vem komponerade den ikoniska musiken till Star Wars-filmerna?",
            "Vad kallar Dexter Morgan sin inre, mordiska personlighet i TV-serien Dexter?",
            "Vilken fiktiv advokatby i Albuquerque, där Jimmy McGill (Saul Goodman) börjar sin karriär, spelar en central roll i Better Call Saul?"
        };

        String[][] svarsAlternativ = {
            {"Steven Spielberg", "Quentin Tarantino", "Martin Scorsese", "Coen-bröderna"},
            {"Huset Lannister", "Huset Stark", "Huset Targaryen", "Huset Baratheon"},
            {"Emma Watson", "Jennifer Lawrence", "Shailene Woodley", "Kristen Stewart"},
            {"Z Nation", "The Last of Us", "The Walking Dead", "Fear the Walking Dead"},
            {"Pocahontas", "Mulan", "Skönheten och Odjuret", "Frozen"},
            {"Martin Freeman", "Tom Hiddleston", "Benedict Cumberbatch", "Andrew Scott"},
            {"Svart", "Blå", "Röd", "Grön"},
            {"Hans Zimmer", "Ennio Morricone", "John Williams", "Howard Shore"},
            {"The Dark Passenger", "The Inner Demon", "The Shadow Killer", "Mr. Hyde"},
            {"Hamlin, Hamlin & McGill", "Wexler & Associates", "Davis & Main", "Mesa Verde Law Group"}
        };

        int[] rattSvar = {2, 2, 2, 3, 2, 3, 3, 3, 1, 1};

        for(int i = 0; i< fragor.length; i++){
            list.add(new Fraga(fragor[i], svarsAlternativ[i], rattSvar[i]));
        }
        
        return list;
    }
}

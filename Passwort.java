import java.util.*; //import des Random Frameworks

public class Passwort { //Java bedingte Formatierungen
    public static void main (String[] arg) { //Java bedingte Formatierungen
        String ps = ""; 
        int i = 0; //Initialisieren der Variabeln

        //Die "while-Schleife" läuft bis i < 10 und somit das Passwort eine länge von 10 Zeichen hat
        while (i<10) {
            int rnd=randomize(0,127); //Aufruf der randomize-Funktion
            //Diese Bedingung unterbindet alle Ascii-Zeichen die nicht auf der Tastatur eingegeben werden können oder die nur mit AltGr eingegeben werden können.
            if (rnd>32 && rnd < 123 && rnd!=64 && rnd!=91 && rnd!=92 && rnd!=93) {
                ps+= Character.toString((char)rnd);
                i++;
            }
        };
        System.out.println("Das generierte Passwort ist: " + ps); //Ausgabe auf der Console
    };
    
    //randomize Funktion die eine Zahl zwischen 0 und 127 zurück gibt
    static int randomize (int x,int y) {
        Random randomNum = new Random();
        int rnd = randomNum.nextInt((y-x)+1)+x;
        return rnd;
    }
}

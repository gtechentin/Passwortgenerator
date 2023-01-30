import java.util.*; //import des Random Frameworks

public class Passwort { //Java bedingte Formatierungen
    public static void main (String[] arg) { //Java bedingte Formatierungen
        String ps = ""; 
        int i = 0; //Initialisieren der Variabeln

        //Die "while-Schleife" läuft bis i < 10 und somit das Passwort eine längevon 10 Zeichen hat
        while (i<10) {
            int rand=randomize(0,127);
            //Diese Bedingung unterbindet alle Ascii-Zeichen die nicht auf der Tastatur eingegeben werden können und die nur mit AltGr eingegeben werden können.
            if (rand>32 && rand < 123 && rand!=64) {
                char c = (char)rand;
                ps+= Character.toString(c);
                i++;
            }
        };
        System.out.println("Das neue Passwort ist: " + ps);
    };
    //randomize Funktion die eine Zahl zwischen 0 und 127 zurück gibt
    static int randomize (int x,int y) {
        Random randomNum = new Random();
        int rand = randomNum.nextInt((y-x)+1)+x;
        return rand;
    }
}

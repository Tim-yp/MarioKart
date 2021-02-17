package MarioKart;


/**
 * Beschreiben Sie hier die Klasse AufgabeMitFahrerlisteLoesung3.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AufgabeMitFahrerlisteLoesung3
{
    public static void main() {
    
        FahrerlisteLoesung3 liste = new FahrerlisteLoesung3();
        System.out.println(liste);
        Fahrer mario = new Fahrer(56.65, "mario");
        
        Fahrer yoshi = new Fahrer(40.65, "Yoshi");
        Fahrer dk = new Fahrer(100.60, "Donkey Kong");
        Fahrer browser = new Fahrer(130.20, "Browser");
        liste.addFahrer(mario);
        System.out.println(liste);
        liste.addFahrer(yoshi);
        liste.addFahrer(dk);
        System.out.println(liste);
        liste.addFahrer(browser);
        System.out.println(liste);
        System.out.println("GH");
        System.out.println(liste);
    }
}

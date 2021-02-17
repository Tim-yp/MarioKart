package MarioKart;


/**
 * Beschreiben Sie hier die Klasse Fahrer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrer
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //
    double gewicht;
    String name ;
    char geschlecht;
    boolean mensch;
    double groesse;
    Items special;
    Fahrer nachfolger;
    Fahrer vorgaenger;

    public Fahrer() // Standardkonstrukror
    {
    }

    public Fahrer(double gewicht)// überladenen Konstruktor 1
    {
        this.gewicht=gewicht;
    }

    public Fahrer(boolean mensch)// überladenen Konstruktor 1
    {
        this.gewicht=gewicht;
    }

    public Fahrer(double gewicht,String name)// überladenen Konstruktor 2
    {
        this.gewicht=gewicht;
        this.name = name;
    }

    public Fahrer(double gewicht, String name,Items special)// überladenen Konstruktor 3
    {
        this(gewicht,name);
        this.special=special;
    }

    public Fahrer(double gewicht,String name,Items special, boolean mensch,double groesse)// überladenen Konstruktor 4
    {
        this(gewicht,name,special);
        this.mensch = mensch;
        this.groesse =groesse;
    }

    public Fahrer(Fahrer x) //Kopierkonstruktor
    {
        this.gewicht = x.gewicht;
        this.name = x.name;
    }

    public String toString()
    {
        String x ="gewicht="+this.gewicht+"name="+this.name;
        return x;
    }
    
    public static void main()
    {
        Fahrer mario = new Fahrer(56.65,"mario");
        Fahrer luigi = new Fahrer(mario); 
        Fahrer x = new Fahrer(true);
        System.out.println(mario);
        System.out.println(luigi);

    }
}

package MarioKart;


/**
 * Beschreiben Sie hier die Klasse FahrerlisteLoesung2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FahrerlisteLoesung2
{
    private Fahrer ersterFahrer;
    
    public Fahrer suche(String name) {
        
        Fahrer merkFahrer = this.ersterFahrer;
        
        while (merkFahrer != null) {
            
            if (this.ersterFahrer.name.equals(name)) {
                return merkFahrer;
            }
            
            merkFahrer = merkFahrer.nachfolger;
        }
    
        return null;
        
    }
    
    public Fahrer gibErsten() {
        if (this.ersterFahrer == null) {
            return null;
        }
        
        return this.ersterFahrer;
    }
    
    public Fahrer gibLetzten() {
        
        Fahrer merkFahrer = this.ersterFahrer;
        
        //nur hier ist es nötig zu checken ob der erste fahrer null ist weil die function toString() 
        //eventuelle gecallt wird wenn ersterFahrer noch null ist
        if (merkFahrer == null) {
            return null;
        }
        
        while (merkFahrer.nachfolger != null) {
            merkFahrer = merkFahrer.nachfolger;
        }
        
        return merkFahrer;
    }
    
    public void addFahrer(Fahrer add) {
        
        //gucken ob fahrer vorhanden
        if (suche(add.name) != null) {
            return;
        }
    
        if (this.ersterFahrer == null) {
            this.ersterFahrer = add;
            return;
        }
        
        Fahrer letzter = this.gibLetzten();
        this.gibLetzten().nachfolger = add;
        this.gibLetzten().vorgaenger = letzter;
    }
    
    public String toString() {
    
        String ausgabe = "";
        Fahrer aktuellerFahrer = this.gibLetzten();
        
        while(aktuellerFahrer != null) {
            ausgabe+= aktuellerFahrer + "\n";
            aktuellerFahrer = aktuellerFahrer.vorgaenger;
        }
        
        return ausgabe;
    }
}

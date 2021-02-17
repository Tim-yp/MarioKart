package MarioKart;


/**
 * Beschreiben Sie hier die Klasse Fahrerliste.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrerliste
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
        
        this.gibLetzten().nachfolger = add;
    }
    
    public String toString() {
    
        String ausgabe = "";
        Fahrer aktuellerFahrer = this.ersterFahrer;
        
        while(aktuellerFahrer != null) {
            ausgabe+= aktuellerFahrer + "\n";
            aktuellerFahrer = aktuellerFahrer.nachfolger;
        }
        
        return ausgabe;
    }
    
}

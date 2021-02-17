package MarioKart;


/**
 * Beschreiben Sie hier die Klasse FahrerlisteLoesung2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FahrerlisteLoesung3
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
    
    //es wird die neuste person immer vorne angefügt, daher ist die erste person die zuletzt hinzugefügte und die letzte die zu erst hinzugefügte
    //daher tauscht man beide funktionen
    public Fahrer gibErsten() {
        
        Fahrer merkFahrer = this.ersterFahrer;
        
        if (merkFahrer == null) {
            return null;
        }
        
        while (merkFahrer.nachfolger != null) {
            merkFahrer = merkFahrer.nachfolger;
        }
        
        return merkFahrer;
    }
    
    public Fahrer gibLetzten() {
        
        if (this.ersterFahrer == null) {
            return null;
        }
        
        return this.ersterFahrer;
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
        
        Fahrer erster = this.ersterFahrer;
        this.ersterFahrer = add;
        this.ersterFahrer.nachfolger = erster;
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

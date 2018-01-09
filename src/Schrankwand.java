import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;


/**
 * Eine Schrankwand, die manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author Claus Albowski
 * @version  (feb 11)
 */
public class Schrankwand extends Moebel
{
    
    private Schrank[] schraenke;
    private int anzahl;
    
    /**
     * Erzeuge eine neue Schrankwand mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Schrankwand(int anzahl) {
        xPosition = 10;
        yPosition = 10;
        farbe = "schwarz";
        orientierung = 0;
        istSichtbar = false;
        int schrankbreite = 60;
        this.anzahl = anzahl;
        breite = schrankbreite*anzahl;
        tiefe  = 37;
        schraenke = new Schrank [anzahl];
        for (i=0;i<anzahl;i++) {
            schraenke[i] =
                new Schrank(i*schrankbreite, 0,
                            farbe, orientierung,
                            schrankbreite, tiefe);
                        }                        
    }
    
    /**
     * Erzeuge eine neue Schrankwand.
     * Konstruktor, bei dem alle Attribute gesetzt werden können.
     */
    public Schrankwand(int xPosition,
                int yPosition,
                String farbe,
                int orientierung,
                int breite,
                int tiefe) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.farbe = farbe;
        this.orientierung = orientierung;
        istSichtbar = false;
        this.breite = breite;
        this.tiefe  = tiefe;
        initSchraenke();
    }
    

    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     */
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
        GeneralPath schrankwand = new GeneralPath();
        for (int i=0 ;i<anzahl;i++){
            schrankwand.append(schraenke[i].gibAktuelleFigur(), false);
        return transformiere(schrankwand);
  
    }
}
}

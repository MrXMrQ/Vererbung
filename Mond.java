public class Mond extends Planet {
    protected String mondName;
    protected int anzahlMond;
    
    public Mond(String name, int durchmesser, double masse, boolean atmosphaere, boolean magnetfeld, String mondName, int anzahlMond) {
        super(name, durchmesser, masse, atmosphaere, magnetfeld);
        this.mondName = mondName;
        this.anzahlMond = anzahlMond;
        
    }
    
    public String getMondName() {
        return mondName;
    }
    
    public int getAnzahlMond() {
        return anzahlMond;
    }
}
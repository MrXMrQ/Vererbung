public class Asteroidenring extends Asteroid {
    protected int anzahl; 
    public Asteroidenring(String name, int durchmesser, double masse, String zugehoerigkeit, int anzahl) {
        super(name, durchmesser, masse, zugehoerigkeit);
        this.anzahl = anzahl;
    }
    
    public int getAnzahl() {
        return anzahl;
    }
    
    public String toString() {
        return "name: " + name + "\ndurchmesser: " + durchmesser + "\nmasse: " + masse + "\nzugehörigkeit: " + zugehoerigkeit + "\nanzahl: " + anzahl;
    }
}
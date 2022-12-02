public class Planet extends Himmelskoerper {
    protected boolean atmosphaere;
    protected boolean magnetfeld;
    
    public Planet(String name,  int durchmesser, double masse, boolean atmosphaere, boolean magnetfeld) {
        super(name, durchmesser, masse);
        this.atmosphaere = atmosphaere;
        this.magnetfeld = magnetfeld; 
    }
    
    public boolean getAtmosphaere() {
        return atmosphaere;
    }
    
    public boolean getMagnetfeld() {
        return magnetfeld;
    }
    
    public String toString() {
        return "name: " + name + "\ndurchmesser: " + durchmesser + "\natmosphäre: " + atmosphaere + "\nmagnetfeld: " + magnetfeld;
    }
}
public class Asteroid extends Himmelskoerper {
    protected String zugehoerigkeit; 
    
    public Asteroid(String name, int durchmesser, double masse, String zugehoerigkeit) {
        super(name, durchmesser, masse);
        this.zugehoerigkeit = zugehoerigkeit; 
    
    }
    
    public String toString() {
        return "name: " + name + "\ndurchmesser: " + durchmesser + "\nmasse: " + masse + "\nzugehörigkeit: " + zugehoerigkeit;
    }
}
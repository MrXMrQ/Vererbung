public class Sonne extends Himmelskoerper {
    protected int hitze;
    
    public Sonne(String name, int durchmesser, double masse, int hitze) {
        super(name, durchmesser, masse);
        this.hitze = hitze;
        
    }
    
    public String toString() {
        return "name: " + name + "\ndurchmesser: " + durchmesser + "\nmasse: " + masse + "\nhitze" + hitze;
    }
}
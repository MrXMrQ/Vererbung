public abstract class Himmelskoerper {
    protected String name;
    protected int durchmesser;
    protected double masse;

    public Himmelskoerper(String name, int durchmesser, double masse) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.masse = masse;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDuchmesser() {
        return durchmesser;
    }
    
    public double getMasse() {
        return masse;
    }
}
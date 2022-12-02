public class Main {
    public static void main() {
        Planet erde = new Planet("Erde", 12700, 5.9, true, true); 
        Sonne sonne = new Sonne("Sonne", 1392684, 1.9, 6000);
        Asteroid ceres = new Asteroid("Ceres", 964, 9.3, "Asteroidengüterl zwischen Mars und Jupiter"); 
        Asteroidenring saturnring = new Asteroidenring("Saturn Ringe", 120536, 0.3, "Saturn Ringe", 1300000);
        
        
        System.out.println(erde + "\n"); 
        System.out.println(ceres + "\n"); 
        System.out.println(sonne + "\n"); 
        System.out.println(saturnring + "\n"); 
    }
}
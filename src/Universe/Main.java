package Universe;

public class Main {
    public static void main(String[] args) {
        Sun sun= Sun.getSun();
        sun.addPlanet(new Planet("Mars",3.711, 687 ));
        sun.addPlanet(new Planet("Venus",8.87, 225 ));
        sun.showOrbit();
    }
}

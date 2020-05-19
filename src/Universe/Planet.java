package Universe;

public class Planet {
    String name;
    double gravity;
    int orbitalPeriod;

    public Planet(String name, double gravity, int orbitalPeriod) {
        this.name = name;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getName() {
        return name;
    }

    public double getGravity() {
        return gravity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }
}

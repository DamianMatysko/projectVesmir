package Universe;

import java.util.ArrayList;

public class Sun {
    //create an object of SingleObject
    private static Sun instance = new Sun();
    private ArrayList<Planet> orbit= new ArrayList<>();
    //make the constructor private so that this class cannot be
    //instantiated
    private Sun(){}
    //Get the only object available
    public static Sun getSun(){
        return instance;
    }

    public boolean addPlanet(Planet planet){
        if (orbit.add(planet)) {
            return true;
        }
        return false;
   }

    public void showOrbit(){
        for (Planet planet : orbit) {
            System.out.println("Name: "+planet.getName()+", Gravity: "+planet.gravity+", Orbital period: "+planet.getOrbitalPeriod());
        }
    }
}

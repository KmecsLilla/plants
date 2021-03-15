package plants;

import java.util.List;

public class Planet {

    private List<Plant> plants;
    private Radiation radiation;

    public Planet(List<Plant> plants, Radiation radiation) {
        this.plants = plants;
        this.radiation = radiation;
    }

    public void oneDayOnThePlanet() {
        Radiance radiance = radiation.radiationForTomorrow();
        for (Plant plant : plants) {
            plant.radiate(radiance);
        }
        radiation.reset();
        for (Plant plant : plants) {
            plant.takeEffectForNextDay();
        }
    }

    public void plantsAlive() {
        System.out.println("Plants state:");
        for (Plant actualPlant : plants) {
            System.out.println("    " + actualPlant.toString());
        }
    }
}



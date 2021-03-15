package plants;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Radiation radiation = new Radiation();
        List<Plant> plants = new ArrayList<Plant>();
        plants.add(new PuffyTree(radiation, "Puffika1", 5));
        plants.add(new PuffyTree(radiation, "Puffika2", 5));
        plants.add(new DeltaTree(radiation, "Delta1", 5));
        plants.add(new DeltaTree(radiation, "Delta2", 5));
        plants.add(new DeltaTree(radiation, "Delta3", 5));
        plants.add(new DeltaTree(radiation, "Delta4", 5));
        plants.add(new ParaBush(radiation, "Parafa1", 5));
        plants.add(new ParaBush(radiation, "Parafa2", 5));

        Planet planet = new Planet(plants, radiation);
        for (int i = 0; i < 365; i++) {
            System.out.println("Day " + i + ":");
            planet.oneDayOnThePlanet();
            System.out.println();
        }

        planet.plantsAlive();
    }
}

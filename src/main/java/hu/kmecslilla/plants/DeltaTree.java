package hu.kmecslilla.plants;

public class DeltaTree extends Plant {

    public DeltaTree(Radiation radiation, String name, int nutrient) {
        super(radiation, name, nutrient);
    }

    @Override
    public boolean isAlive() {
        if (nutrient < 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void radiate(Radiance radiance) {
        if (!isAlive()) {
            return;
        }
        switch (radiance) {
            case ALFA_RADIANCE:
                nutrient -= 3;
                break;
            case DELTA_RADIANCE:
                nutrient += 4;
                break;
            case NONE_RADIANCE:
                nutrient -= 1;
                break;
        }
        printNutrient();

    }

    @Override
    public void takeEffectForNextDay() {
        if (isAlive()) {
            if (nutrient > 0 && nutrient < 5) {
                radiation.changeDelta(4);
            } else if (nutrient >= 5 && nutrient < 10) {
                radiation.changeDelta(1);
            }
        }
    }
}

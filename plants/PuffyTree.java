package plants;

public class PuffyTree extends Plant {

    public PuffyTree(Radiation radiation, String name, int nutrient) {
        super(radiation, name, nutrient);
    }

    @Override
    public boolean isAlive() {
        if (nutrient < 1 || nutrient > 10) {
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
                nutrient += 2;
                break;
            case DELTA_RADIANCE:
                nutrient -= 2;
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
            radiation.changeAlfa(10 - nutrient);
        }
    }
}

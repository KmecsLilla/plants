package plants;

public class ParaBush extends Plant {

    public ParaBush(Radiation radiation, String name, int nutrient) {
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
                nutrient += 1;
                break;
            case DELTA_RADIANCE:
                nutrient += 1;
                break;
            case NONE_RADIANCE:
                nutrient -= 1;
                break;
        }
        printNutrient();
    }

    @Override
    public void takeEffectForNextDay() {
    }
}

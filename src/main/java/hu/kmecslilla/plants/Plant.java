package hu.kmecslilla.plants;

public abstract class Plant {
    protected Radiation radiation;
    protected String name;
    protected int nutrient;

    public Plant(Radiation radiation, String name, int nutrient) {
        this.radiation = radiation;
        this.name = name;
        this.nutrient = nutrient;
    }

    protected void printNutrient() {
        System.out.println("    Nutrient of " + name + ": " + nutrient);
    }

    public abstract boolean isAlive();

    public abstract void radiate(Radiance radiance);

    public abstract void takeEffectForNextDay();

    @Override
    public String toString() {
        return name + ": " + isAlive();
    }
}

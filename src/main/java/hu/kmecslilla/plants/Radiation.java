package hu.kmecslilla.plants;

public class Radiation {
    private int sumForAlfa = 0;
    private int sumForDelta = 0;

    public void reset() {
        sumForAlfa = 0;
        sumForDelta = 0;
    }

    public void changeAlfa(int diffAlfa) {
        sumForAlfa += diffAlfa;
    }

    public void changeDelta(int diffDelta) {
        sumForDelta += diffDelta;
    }

    public Radiance radiationForTomorrow() {
        System.out.println("    Sum for alfa: " + sumForAlfa);
        System.out.println("    Sum for delta: " + sumForDelta);
        Radiance result;
        if ((sumForAlfa - sumForDelta) > 3) {
            result = Radiance.ALFA_RADIANCE;
        } else if ((sumForDelta - sumForAlfa) > 3) {
            result = Radiance.DELTA_RADIANCE;
        } else {
            result = Radiance.NONE_RADIANCE;
        }
        System.out.println("    Radiation: " + result);
        return result;
    }
}

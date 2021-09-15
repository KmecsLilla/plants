package hu.kmecslilla.plants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiationTest {
    @Test
    public void testRadiationForTomorrow_alfaRadiation() {
        Radiation radiation = new Radiation();
        radiation.changeAlfa(5);
        radiation.changeDelta(1);

        Radiance radiance = radiation.radiationForTomorrow();

        assertEquals(Radiance.ALFA_RADIANCE, radiance);
    }

    @Test
    public void testRadiationForTomorrow_deltaRadiation() {
        Radiation radiation = new Radiation();
        radiation.changeAlfa(3);
        radiation.changeDelta(7);

        Radiance radiance = radiation.radiationForTomorrow();

        assertEquals(Radiance.DELTA_RADIANCE, radiance);
    }

    @Test
    public void testRadiationForTomorrow_noneRadiation() {
        Radiation radiation = new Radiation();
        radiation.changeAlfa(5);
        radiation.changeDelta(6);

        Radiance radiance = radiation.radiationForTomorrow();

        assertEquals(Radiance.NONE_RADIANCE, radiance);
    }
}

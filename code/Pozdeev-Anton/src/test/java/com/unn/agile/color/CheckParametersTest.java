package com.unn.agile.color;

import org.junit.Test;

import static com.unn.agile.color.CheckParameters.*;
import static org.junit.Assert.assertTrue;

public class CheckParametersTest {

    @Test(expected = IllegalArgumentException.class)
    public void checkNumberParametersWithoutParams() {
        checkNumberParameters(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNumberParameters4Params() {
        checkNumberParameters(new double[]{1, 2, 3, 4});
    }

    @Test()
    public void testCheckNumberParameters() {
        assertTrue(checkNumberParameters(new double[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectNumberParametersRGB() {
        checkParametersRGB(new double[]{-1, 100, 100, 100});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersRGB1() {
        checkParametersRGB(new double[]{-1, 100, 100});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersRGB2() {
        checkParametersRGB(new double[]{100, 100, 256});
    }

    @Test(expected = NumberFormatException.class)
    public void checkIncorrectParametersRGB3() {
        checkParametersRGB(new double[]{255, 255, 244.1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectNumberParametersLAB() {
        checkParametersLAB(new double[]{-1, 100, 100, 200});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersLAB1() {
        checkParametersLAB(new double[]{-1, 100, 100});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersLAB2() {
        checkParametersLAB(new double[]{99, 100, -256});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersLAB3() {
        checkParametersLAB(new double[]{0, -128, 129});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersLAB4() {
        checkParametersLAB(new double[]{0, -129, 128});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectNumberParametersHSV() {
        checkParametersHSV(new double[]{-1, 100, 100, 100});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersHSV1() {
        checkParametersHSV(new double[]{-1, 100, 100});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersHSV2() {
        checkParametersHSV(new double[]{100, 100, 361});
    }

    @Test(expected = NumberFormatException.class)
    public void checkIncorrectParametersHSV3() {
        checkParametersHSV(new double[]{1.2, 255, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncorrectParametersHSV4() {
        checkParametersHSV(new double[]{10, 255, 1});
    }
}

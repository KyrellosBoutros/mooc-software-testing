package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear;

public class GHappyTest {

    @Test
    public void gHappyFirstTest() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappySecondTest() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyThirdTest() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("ggyyxggxxgg");
        Assertions.assertTrue(result);
    }
}

package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void gHappyFirstTest() {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("atz", 3);
        Assertions.assertEquals("dwc",result);
    }
}

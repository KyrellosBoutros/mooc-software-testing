package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorFirstTest() {
        Mirror mrr = new Mirror();
        String result = mrr.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab",result);
    }

    @Test
    public void mirrorSecondTest() {
        Mirror mrr = new Mirror();
        String result = mrr.mirrorEnds("abca");
        Assertions.assertEquals("a",result);
    }

    @Test
    public void mirrorThirdTest() {
        Mirror mrr = new Mirror();
        String result = mrr.mirrorEnds("aba");
        Assertions.assertEquals("aba",result);
    }
}

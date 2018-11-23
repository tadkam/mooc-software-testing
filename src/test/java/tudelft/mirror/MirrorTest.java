package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    public Mirror mirror = new Mirror();

    @Test
    public void singleMiroor(){
        String result =  mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void allWordIsMirror() {
        String result = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }

    @Test
    public void longWordWithMirror() {
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);

    }

    @Test
    public void allWordIsMirrorDoubble() {
        String result = mirror.mirrorEnds("AbbA");
        Assertions.assertEquals("AbbA", result);


    }


}

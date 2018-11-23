package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    public GHappy ghappy = new GHappy();

    @Test
    public void twoGNextToEachOther(){
        boolean result = ghappy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void oneG(){
        boolean result = ghappy.gHappy("xxgxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void ThreegInTheMiddle(){
        boolean result = ghappy.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }

    @ParameterizedTest(name = "str ={0}, expectedResult={1}")
    @CsvSource({"gxxggyygxx, false", "ggxxggxx, true"})
    public void gAtBegining(String str, boolean expectedResult){
        boolean result = ghappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }


}



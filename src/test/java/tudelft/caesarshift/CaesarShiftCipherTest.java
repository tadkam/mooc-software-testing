package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {


    public CaesarShiftCipher cipher = new CaesarShiftCipher();



    @ParameterizedTest(name= "message ={0}, shift = {1}, expectedResult = {2}")
    @CsvSource({"a,1,b", "g, 2, i", "y,-1,x", "z, 1, a", "d, 2, f"})
    public void oneLetterShift(String message, int shift, String expectedResult){

        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);


    }

    @ParameterizedTest(name= "message ={0}, shift = {1}, expectedResult = {2}")
    @CsvSource({"ala, 3, dod", "ala, -3, xix" })
    public void simpleName(String message, int shift, String expectedResult){

        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name= "message ={0}, shift = {1}, expectedResult = {2}")
    @CsvSource({"a l a, 3, d o d", "a l a, -3, x i x" })
    public void simpleNameWithSpace(String message, int shift, String expectedResult){

        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name= "message ={0}, shift = {1}, expectedResult = {2}")
    @CsvSource({"to jest wiadomosc, 5, yt ojxy bnfitrtxh"  })
    public void messageWithSpace(String message, int shift, String expectedResult){

        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }






}





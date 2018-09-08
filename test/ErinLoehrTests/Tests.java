package ErinLoehrTests;

import org.junit.Assert;
import org.junit.Test;
import romannumberconvertor.RomanNumberConvertor;


public class Tests {


    @Test
    public void testZero(){
        Assert.assertEquals(RomanNumberConvertor.arabicToRoman(0), "Please enter a valid value");
    }

    @Test
    public void testNegativeNumber(){
        Assert.assertEquals(RomanNumberConvertor.arabicToRoman(-5), "Please enter a valid value");
    }

    @Test
    public void testPositiveNumber(){
        Assert.assertEquals(RomanNumberConvertor.arabicToRoman(53), "LIII");
    }

    @Test
    public void testMax(){
        Assert.assertEquals(RomanNumberConvertor.arabicToRoman(4999), "MMMMCMXCIX");
    }

    @Test
    public void testPastMax(){
        Assert.assertEquals(RomanNumberConvertor.arabicToRoman(5000), "Please enter a valid value");
    }


}

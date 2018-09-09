package ZacharyToneyTests;

import org.junit.Test;
import static org.junit.Assert.*;
public class zacharyToney {
    
    @Test
    public void testBasicEntry(){
        String test = "MM";
        int result = 
                romannumberconvertor.RomanNumberConvertor.romanToArabic(test);
        assertEquals(2000,result);
    }
   
    @Test
    public void testIX(){
        String test = "IX";
        int result = 
                romannumberconvertor.RomanNumberConvertor.romanToArabic(test);
        assertEquals(9,result);
    }
    @Test
    public void testMMM(){
        String test = "MMM";
        int result = 
                romannumberconvertor.RomanNumberConvertor.romanToArabic(test);
        assertEquals(3000,result);
    }
    
    @Test
    public void testIVX(){
        String test = "IVX";
        int result = 
                romannumberconvertor.RomanNumberConvertor.romanToArabic(test);
        assertEquals(14,result);
    }
    
    @Test
    public void testLCDM(){
        String test = "LCDM";
        int result = 
                romannumberconvertor.RomanNumberConvertor.romanToArabic(test);
        assertEquals(550,result);
    }
}

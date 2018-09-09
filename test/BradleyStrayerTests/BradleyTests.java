package BradleyStrayerTests;

import org.junit.Test;

import romannumberconvertor.RomanNumberConvertor;

import static org.junit.Assert.*;


public class BradleyTests {


    @Test
    public void testRandomString(){
    	String x = "LMEHH";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(x));
    }

    @Test
    public void testNormal(){
    	String x = "MCDXXIII";
        assertEquals(1423, romannumberconvertor.RomanNumberConvertor.romanToArabic(x));
    }

    @Test
	public void testArabicToRomanNormal() {
		String result = RomanNumberConvertor.arabicToRoman(527);
		assertEquals("DXXVII", result);
	}
	
	@Test
	public void testArabicToRomanOverMax() {
		String result = RomanNumberConvertor.arabicToRoman(65021);
		assertEquals("Please enter a valid value", result);
	}

}

package EvanFischerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import romannumberconvertor.RomanNumberConvertor;

public class RomanNumberConvertorTest {

	@Test
	public void testArabicToRomanFromTreeMap() {
		String result = RomanNumberConvertor.arabicToRoman(5);
		assertEquals("V", result);
	}
	
	@Test
	public void testArabicToRomanOneDigit() {
		String result = RomanNumberConvertor.arabicToRoman(6);
		assertEquals("VI", result);
	}
	
	@Test
	public void testArabicToRomanTwoDigit() {
		String result = RomanNumberConvertor.arabicToRoman(34);
		assertEquals("XXXIV", result);
	}
	
	@Test
	public void testArabicToRomanThreeDigits() {
		String result = RomanNumberConvertor.arabicToRoman(542);
		assertEquals("DXLII", result);
	}
	
	@Test
	public void testArabicToRomanFourDigit() {
		String result = RomanNumberConvertor.arabicToRoman(2756);
		assertEquals("MMDCCLVI", result);
	}
	
	@Test
	public void testArabicToRomanMIN() {
		String result = RomanNumberConvertor.arabicToRoman(1);
		assertEquals("I", result);
	}
	
	@Test
	public void testArabicToRomanMAX() {
		String result = RomanNumberConvertor.arabicToRoman(4999);
		assertEquals("MMMMCMXCIX", result);
	}
	

	

}

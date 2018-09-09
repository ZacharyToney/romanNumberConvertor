package KeithDeSiminiTests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Keith DeSimini
 */
public class mainJunitTest {
	

	@Test
    public void testOneRomanFollowedByOneNonRoman() {
        String string = "VA";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testTwoRomanFollowedByTwoNonRoman() {
        String string = "VIAZ";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void MixOfNonRomanAndRoman() {
        String string = "VIAZDHWYDHCNSKDF";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testTwoNonRoman() {
        String string = "ZL";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testArabic() {
        String string = "0";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testNegativeArabic() {
        String string = "-6";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testMultipleNegativeArabic() {
        String string = "-3726";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testArabicWithNonRoman() {
        String string = "0Z";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testNonRomanFollowedByArabic() {
        String string = "Z0";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testMultipleArabic() {
        String string = "87384";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testMultipleArabicFollowedByMultipleRoman() {
        String string = "87384XVI";
        assertEquals(0, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }


    @Test
    public void testFor6() {
        String string = "VI";
        assertEquals(6, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testFor14() {
        String string = "XIV";
        assertEquals(14, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testFor20() {
        String string = "XX";
        assertEquals(20, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testFor150() {
        String string = "CL";
        assertEquals(150, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testFor37273() {
        String string = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCLXXIII";
        assertEquals(37273, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testI() {
        String string = "I";
        assertEquals(1, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testV() {
        String string = "V";
        assertEquals(5, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testX() {
        String string = "X";
        assertEquals(10, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testL() {
        String string = "L";
        assertEquals(50, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testC() {
        String string = "C";
        assertEquals(100, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testD() {
        String string = "D";
        assertEquals(500, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testM() {
        String string = "M";
        assertEquals(1000, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }

    @Test
    public void testFor3728() {
        String string = "MMMDCCXXVIII";
        assertEquals(3728, romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
        System.out.println(romannumberconvertor.RomanNumberConvertor.romanToArabic(string));
    }


}
